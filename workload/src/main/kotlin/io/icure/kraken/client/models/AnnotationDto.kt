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
 * Text node with attribution. Could be written by a healthcare party, as a side node of a     |medical record. For example, after taking a temperature, the HCP adds a node explaining the     |thermometer is faulty.
 *
 * @param id The Id of the Annotation. We encourage using either a v4 UUID or a HL7 Id.
 * @param author
 * @param created The timestamp (unix epoch in ms) of creation of this note, will be filled automatically if missing. Not enforced by the application server.
 * @param modified The timestamp (unix epoch in ms) of the latest modification of this note, will be filled automatically if missing. Not enforced by the application server.
 * @param text Text contained in the note, written as markdown.
 * @param location Defines to which part of the corresponding information the note is related to.
 */

data class AnnotationDto (

    /* The Id of the Annotation. We encourage using either a v4 UUID or a HL7 Id. */

    val id: kotlin.String,


    val author: kotlin.String? = null,

    /* The timestamp (unix epoch in ms) of creation of this note, will be filled automatically if missing. Not enforced by the application server. */

    val created: kotlin.Long? = null,

    /* The timestamp (unix epoch in ms) of the latest modification of this note, will be filled automatically if missing. Not enforced by the application server. */

    val modified: kotlin.Long? = null,

    /* Text contained in the note, written as markdown. */

    val text: kotlin.String? = null,

    /* Defines to which part of the corresponding information the note is related to. */

    val location: kotlin.String? = null

)

