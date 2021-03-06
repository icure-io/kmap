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
 * @param title 
 * @param comment 
 * @param receptionDate 
 * @param processingDate 
 * @param processer 
 * @param cancellationDate 
 * @param canceller 
 * @param cancellationReason 
 * @param cancellationNote 
 * @param status 
 * @param homeVisit 
 * @param municipality 
 * @param town 
 * @param zipCode 
 * @param street 
 * @param building 
 * @param buildingNumber 
 * @param doorbellName 
 * @param floor 
 * @param letterBox 
 * @param notesOps 
 * @param notesContact 
 * @param latitude 
 * @param longitude 
 * @param type 
 * @param emergency 
 * @param phoneNumber 
 * @param patientId 
 * @param patientLastName 
 * @param patientFirstName 
 * @param description 
 * @param interventionCode 
 */

data class FlowItemDto (

    
    val id: kotlin.String? = null,

    
    val title: kotlin.String? = null,

    
    val comment: kotlin.String? = null,

    
    val receptionDate: kotlin.Long? = null,

    
    val processingDate: kotlin.Long? = null,

    
    val processer: kotlin.String? = null,

    
    val cancellationDate: kotlin.Long? = null,

    
    val canceller: kotlin.String? = null,

    
    val cancellationReason: kotlin.String? = null,

    
    val cancellationNote: kotlin.String? = null,

    
    val status: kotlin.String? = null,

    
    val homeVisit: kotlin.Boolean? = null,

    
    val municipality: kotlin.String? = null,

    
    val town: kotlin.String? = null,

    
    val zipCode: kotlin.String? = null,

    
    val street: kotlin.String? = null,

    
    val building: kotlin.String? = null,

    
    val buildingNumber: kotlin.String? = null,

    
    val doorbellName: kotlin.String? = null,

    
    val floor: kotlin.String? = null,

    
    val letterBox: kotlin.String? = null,

    
    val notesOps: kotlin.String? = null,

    
    val notesContact: kotlin.String? = null,

    
    val latitude: kotlin.String? = null,

    
    val longitude: kotlin.String? = null,

    
    val type: kotlin.String? = null,

    
    val emergency: kotlin.Boolean? = null,

    
    val phoneNumber: kotlin.String? = null,

    
    val patientId: kotlin.String? = null,

    
    val patientLastName: kotlin.String? = null,

    
    val patientFirstName: kotlin.String? = null,

    
    val description: kotlin.String? = null,

    
    val interventionCode: kotlin.String? = null

)

