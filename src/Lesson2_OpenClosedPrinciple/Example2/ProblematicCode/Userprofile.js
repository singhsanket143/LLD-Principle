const UserProfile = ({ user }) => {
    const displayInfo = () => {
        switch (user.role) {
            case 'admin':
                return <AdminView user={user} />;
            case 'editor':
                return <EditorView user={user} />;
            default:
                return <StandardView user={user} />;
        }
    };

    return <div>{displayInfo()}</div>;
};
