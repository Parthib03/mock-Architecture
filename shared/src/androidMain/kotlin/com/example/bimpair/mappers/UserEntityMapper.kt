package com.example.bimpair.mappers

import com.example.bimpair.models.User
import com.example.bimpair.database.YourEntity

fun User.toEntity(): YourEntity {
    return YourEntity(
        id = id,
        name = name,
        email = email,
        token = token
    )
}
