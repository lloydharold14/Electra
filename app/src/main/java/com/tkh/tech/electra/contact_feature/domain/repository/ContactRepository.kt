package com.tkh.tech.electra.contact_feature.domain.repository

import com.tkh.tech.electra.contact_feature.domain.model.Contact
import com.tkh.tech.electra.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface ContactRepository {

    fun getContacts(id: Int): Flow<Resource<List<Contact>>>

    suspend fun insertContact(contact: Contact)

    suspend fun deleteContact(contact: Contact)

}