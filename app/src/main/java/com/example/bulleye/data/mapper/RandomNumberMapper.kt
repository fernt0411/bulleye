package com.example.bulleye.data.mapper

import com.example.bulleye.data.response.RandomNumberResponse
import com.example.bulleye.domain.model.RandomNumber


fun RandomNumberResponse.toDomain(): RandomNumber {
    return RandomNumber(
        number = this.number,
        description = this.description
    )
}