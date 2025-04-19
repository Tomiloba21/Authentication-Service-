# Authentication-Service-

### User Registration and Login:

Users can register with roles (User, Student, Instructor, Admin)

Authentication via JWT tokens

Password encryption with BCrypt


### Security Features:

JWT-based authentication

Role-based access control

Token refresh mechanism

Secure logout capability


### API Endpoints:

```/api/auth/signup``` - Register new users

```/api/auth/signin```- Login and get JWT tokens

```/api/auth/refreshtoken``` - Refresh access tokens

```/api/auth/signout```- Logout and invalidate tokens

Various test endpoints for different roles


### Database Structure:

User entity with roles relationship
Role entity with predefined roles
RefreshToken entity for token management



How to Use the Authentication Service

1) Registration:

 ```POST /api/auth/signup ```
```json

    {
      "username": "johndoe",
      "email": "john@example.com",
      "password": "password123",
      "role": ["student"]
    }

```
2) Login

```POST /api/auth/signin```
```json

{
  "username": "johndoe",
  "password": "password123"
}
``` 
Response will include the JWT token and refresh token.
3) Access Protected Resources:
   Include the JWT token in the Authorization header:
``` Authorization: Bearer {your-jwt-token}```

4) Token Refresh:
```POST /api/auth/refreshtoken```
```json

{
  "refreshToken": "{your-refresh-token}"
}
```
5) Logout:
```POST /api/auth/signout```

#

## Integration with Other Microservices
Other microservices can validate incoming JWTs by:

Sharing the secret key with this authentication service
Implementing similar JWT validation logic
Checking the roles in the JWT to enforce authorization
