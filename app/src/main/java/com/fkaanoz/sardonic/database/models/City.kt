package com.fkaanoz.sardonic.database.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class City (@PrimaryKey val id : Int, val name : String)