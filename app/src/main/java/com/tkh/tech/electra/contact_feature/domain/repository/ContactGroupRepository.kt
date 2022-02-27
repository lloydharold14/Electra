package com.tkh.tech.electra.contact_feature.domain.repository

import com.tkh.tech.electra.contact_feature.domain.model.Contact
import com.tkh.tech.electra.contact_feature.domain.model.ContactsGroup
import com.tkh.tech.electra.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface ContactGroupRepository {

    fun getGroup(id: Int): Flow<Resource<List<ContactsGroup>>>

    suspend fun insertGroup(contactsGroup: ContactsGroup)

    suspend fun deleteGroup(contactsGroup: ContactsGroup)

}