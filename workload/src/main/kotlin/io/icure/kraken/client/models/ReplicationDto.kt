/**
 * iCure Data Stack API Documentation
 *
 * The iCure Data Stack Application API is the native interface to iCure.
 *
 * The version of the OpenAPI document: v2
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
package io.icure.kraken.client.models

/**
 *
 *
 * @param id
 * @param databaseSynchronizations
 * @param rev
 * @param deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called.
 * @param name
 * @param context
 */

data class ReplicationDto (


    val id: kotlin.String,


    val databaseSynchronizations: kotlin.collections.List<DatabaseSynchronizationDto> = emptyList(),


    val rev: kotlin.String? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,


    val name: kotlin.String? = null,


    val context: kotlin.String? = null

)

