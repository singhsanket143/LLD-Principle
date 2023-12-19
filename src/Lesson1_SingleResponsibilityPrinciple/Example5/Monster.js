const User = require("../models/user.model");
var bcrypt = require("bcryptjs");
/***
 *
 *
 * Forgot password
 */
exports.update = async (req, res) => {
    const userIdReq = req.userId;
    try {
        const user = await User.findOneAndUpdate({
            userId: userIdReq
        }, {
            password: bcrypt.hashSync(req.body.password, 8)
        }).exec();
        res.status(200).send({
            message: `User record has been updated successfully`
        });
    } catch (err) {
        console.error("Error while updating the record", err.message);
        res.status(500).send({
            message: "Some internal error occured"
        })
    };
}

exports.getAllUsers = async (req, res) => {
    console.log("Getting")
    const users = await User.find({});
    res.status(200).send(users);

}


/**
 * Update the user status
 */

exports.updateUser = async (req, res) => {
    const userIdReq = req.params.userId;
    try {
        const user = await User.findOneAndUpdate({
            userId: userIdReq
        }, {
            name: req.body.name,
            userStatus: req.body.userStatus,
            userType: req.body.userType

        }).exec();
        res.status(200).send({

            message: `User record has been updated successfully`

        });
    } catch (err) {
        console.err("Error while updating the record", err.message);
        res.status(500).send({
            message: "Some internal error occured"
        })

    };
}