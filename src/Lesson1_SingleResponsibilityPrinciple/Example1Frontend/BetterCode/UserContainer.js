import React from 'react';

function UserProfileContainer() {
    const { user, loading, error } = useFetchUserData(123);

    if (loading) return <div>Loading...</div>;
    if (error) return <div>{error}</div>;

    return user ? <UserProfile user={user} /> : <div>No user data.</div>;
}
