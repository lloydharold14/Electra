package com.tkh.tech.electra.contact_feature.domain.model

data class ContactsGroup(

    val groupId: Int? = null,
    val groupName: String?,
    val contacts: List<Contact>

    )
