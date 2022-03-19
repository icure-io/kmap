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
 * This entity represents a Service. A Service is created in the course a contact. Services include subjective information provided by the patient, such as complaints, reason for visit, feelings, etc. or objective information like bio-metric measures (blood pressure, temperature, heart beat, etc.), or physical exam description, diagnosis, prescription, integration of lab reports from another healthcare party, action plan, etc. Any action performed by the healthcare party which is relevant for the healthcare element of a patient is considered a service. The services can be linked to healthcare elements or other structuring elements of the medical record
 *
 * @param id The Id of the Service. We encourage using either a v4 UUID or a HL7 Id.
 * @param identifier
 * @param cryptedForeignKeys The public patient key, encrypted here for separate Crypto Actors.
 * @param delegations The delegations giving access to connected healthcare information.
 * @param encryptionKeys The contact secret encryption key used to encrypt the secured properties (like services for example), encrypted for separate Crypto Actors.
 * @param content Information contained in the service. Content is localized, using ISO language code as key
 * @param textIndexes
 * @param invoicingCodes List of invoicing codes
 * @param notes Comments - Notes recorded by a HCP about this service
 * @param qualifiedLinks Links towards related services (possibly in other contacts)
 * @param codes A code is an item from a codification system that qualifies the content of this entity. SNOMED-CT, ICPC-2 or ICD-10 codifications systems can be used for codes
 * @param tags A tag is an item from a codification system that qualifies an entity as being member of a certain class, whatever the value it might have taken. If the tag qualifies the content of a field, it means that whatever the content of the field, the tag will always apply. For example, the label of a field is qualified using a tag. LOINC is a codification system typically used for tags.
 * @param transactionId The transactionId is used when a single service had to be split into parts for technical reasons. Several services with the same non null transaction id form one single service
 * @param contactId Id of the contact during which the service is provided
 * @param subContactIds List of IDs of all sub-contacts that link the service to structural elements. Only used when the Service is emitted outside of its contact
 * @param plansOfActionIds List of IDs of all plans of actions (healthcare approaches) as a part of which the Service is provided. Only used when the Service is emitted outside of its contact
 * @param healthElementsIds List of IDs of all healthcare elements for which the service is provided. Only used when the Service is emitted outside of its contact
 * @param formIds List of Ids of all forms linked to the Service. Only used when the Service is emitted outside of its contact.
 * @param secretForeignKeys The secret patient key, encrypted in the patient document, in clear here.
 * @param label Description / Unambiguous qualification (LOINC code) of the type of information contained in the service. Could be a code to qualify temperature, complaint, diagnostic, ...
 * @param index Used for sorting services inside an upper object (A contact, a transaction, a FHIR bundle, ...)
 * @param encryptedContent
 * @param valueDate The date (YYYYMMDDhhmmss) when the Service is noted to have started and also closes on the same date
 * @param openingDate The date (YYYYMMDDhhmmss) of the start of the Service
 * @param closingDate The date (YYYYMMDDhhmmss) marking the end of the Service
 * @param formId Id of the form used during the Service
 * @param created The timestamp (unix epoch in ms) of creation of this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param modified The date (unix epoch in ms) of the latest modification of this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param endOfLife Soft delete (unix epoch in ms) timestamp of the object.
 * @param author The id of the User that has created this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param responsible The id of the HealthcareParty that is responsible for this entity, will be filled automatically if missing. Not enforced by the application server.
 * @param medicalLocationId The id of the medical location where this entity was created.
 * @param comment Text, comments on the Service provided
 * @param status
 * @param encryptedSelf The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys.
 */

data class ServiceDto (

    /* The Id of the Service. We encourage using either a v4 UUID or a HL7 Id. */

    val id: kotlin.String,


    val identifier: kotlin.collections.List<IdentifierDto> = emptyList(),

    /* The public patient key, encrypted here for separate Crypto Actors. */

    val cryptedForeignKeys: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* The delegations giving access to connected healthcare information. */

    val delegations: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* The contact secret encryption key used to encrypt the secured properties (like services for example), encrypted for separate Crypto Actors. */

    val encryptionKeys: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<DelegationDto>> = emptyMap(),

    /* Information contained in the service. Content is localized, using ISO language code as key */

    val content: kotlin.collections.Map<kotlin.String, ContentDto> = emptyMap(),


    val textIndexes: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),

    /* List of invoicing codes */

    val invoicingCodes: kotlin.collections.List<kotlin.String> = emptyList(),

    /* Comments - Notes recorded by a HCP about this service */

    val notes: kotlin.collections.List<AnnotationDto> = emptyList(),

    /* Links towards related services (possibly in other contacts) */

    val qualifiedLinks: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>> = emptyMap(),

    /* A code is an item from a codification system that qualifies the content of this entity. SNOMED-CT, ICPC-2 or ICD-10 codifications systems can be used for codes */

    val codes: kotlin.collections.List<CodeStubDto> = emptyList(),

    /* A tag is an item from a codification system that qualifies an entity as being member of a certain class, whatever the value it might have taken. If the tag qualifies the content of a field, it means that whatever the content of the field, the tag will always apply. For example, the label of a field is qualified using a tag. LOINC is a codification system typically used for tags. */

    val tags: kotlin.collections.List<CodeStubDto> = emptyList(),

    /* The transactionId is used when a single service had to be split into parts for technical reasons. Several services with the same non null transaction id form one single service */

    val transactionId: kotlin.String? = null,

    /* Id of the contact during which the service is provided */

    val contactId: kotlin.String? = null,

    /* List of IDs of all sub-contacts that link the service to structural elements. Only used when the Service is emitted outside of its contact */

    val subContactIds: kotlin.collections.Set<kotlin.String>? = null,

    /* List of IDs of all plans of actions (healthcare approaches) as a part of which the Service is provided. Only used when the Service is emitted outside of its contact */

    val plansOfActionIds: kotlin.collections.Set<kotlin.String>? = null,

    /* List of IDs of all healthcare elements for which the service is provided. Only used when the Service is emitted outside of its contact */

    val healthElementsIds: kotlin.collections.Set<kotlin.String>? = null,

    /* List of Ids of all forms linked to the Service. Only used when the Service is emitted outside of its contact. */

    val formIds: kotlin.collections.Set<kotlin.String>? = null,

    /* The secret patient key, encrypted in the patient document, in clear here. */

    val secretForeignKeys: kotlin.collections.Set<kotlin.String>? = null,

    /* Description / Unambiguous qualification (LOINC code) of the type of information contained in the service. Could be a code to qualify temperature, complaint, diagnostic, ... */

    val label: kotlin.String? = null,

    /* Used for sorting services inside an upper object (A contact, a transaction, a FHIR bundle, ...) */

    val index: kotlin.Long? = null,


    @Deprecated(message = "This property is deprecated.")
    val encryptedContent: kotlin.String? = null,

    /* The date (YYYYMMDDhhmmss) when the Service is noted to have started and also closes on the same date */

    val valueDate: kotlin.Long? = null,

    /* The date (YYYYMMDDhhmmss) of the start of the Service */

    val openingDate: kotlin.Long? = null,

    /* The date (YYYYMMDDhhmmss) marking the end of the Service */

    val closingDate: kotlin.Long? = null,

    /* Id of the form used during the Service */

    val formId: kotlin.String? = null,

    /* The timestamp (unix epoch in ms) of creation of this entity, will be filled automatically if missing. Not enforced by the application server. */

    val created: kotlin.Long? = null,

    /* The date (unix epoch in ms) of the latest modification of this entity, will be filled automatically if missing. Not enforced by the application server. */

    val modified: kotlin.Long? = null,

    /* Soft delete (unix epoch in ms) timestamp of the object. */

    val endOfLife: kotlin.Long? = null,

    /* The id of the User that has created this entity, will be filled automatically if missing. Not enforced by the application server. */

    val author: kotlin.String? = null,

    /* The id of the HealthcareParty that is responsible for this entity, will be filled automatically if missing. Not enforced by the application server. */

    val responsible: kotlin.String? = null,

    /* The id of the medical location where this entity was created. */

    val medicalLocationId: kotlin.String? = null,

    /* Text, comments on the Service provided */

    val comment: kotlin.String? = null,


    val status: kotlin.Int? = null,

    /* The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys. */

    val encryptedSelf: kotlin.String? = null

)

