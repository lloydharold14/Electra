package com.tkh.tech.electra.contact_feature.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tkh.tech.electra.contact_feature.domain.model.Contact

@Entity
data class ContactGroupEntity(

    @PrimaryKey
    val id: Int? = null,
    val name: String?,
    val contacts: List<Contact>
)
