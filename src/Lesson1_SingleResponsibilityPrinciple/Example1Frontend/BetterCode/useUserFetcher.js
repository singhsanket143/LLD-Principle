import { useState, useEffect } from 'react';
import axios from 'axios';

function useFetchUserData(userId) {
    const [data, setData] = useState({ user: null, loading: true, error: '' });

    useEffect(() => {
        axios.get(`/api/user/${userId}`)
            .then(response => setData({ ...data, user: response.data }))
            .catch(error => setData({ ...data, error: 'Error fetching user data' }))
            .finally(() => setData({ ...data, loading: false }));
    }, [userId]);

    return data;
}
