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
 * @param revisionsChecked 
 * @param missingRevisionsFound 
 * @param docsRead 
 * @param docsWritten 
 * @param changesPending 
 * @param docWriteFailures 
 * @param checkpointedSourceSeq 
 * @param startTime 
 * @param error 
 */

data class ReplicationStatsDto (

    
    val revisionsChecked: kotlin.Int? = null,

    
    val missingRevisionsFound: kotlin.Int? = null,

    
    val docsRead: kotlin.Int? = null,

    
    val docsWritten: kotlin.Int? = null,

    
    val changesPending: kotlin.Int? = null,

    
    val docWriteFailures: kotlin.Int? = null,

    
    val checkpointedSourceSeq: kotlin.String? = null,

    
    val startTime: java.time.OffsetDateTime? = null,

    
    val error: kotlin.String? = null

)

