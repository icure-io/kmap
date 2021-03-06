/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */
package org.taktik.icure.services.external.rest.v1.dto


import org.taktik.icure.services.external.rest.v1.dto.base.CodeStubDto
import org.taktik.icure.services.external.rest.v1.dto.base.EncryptableDto
import org.taktik.icure.services.external.rest.v1.dto.base.ICureDocumentDto
import org.taktik.icure.services.external.rest.v1.dto.base.StoredDocumentDto
import org.taktik.icure.services.external.rest.v1.dto.embed.*

data class InvoiceDto(
         override val id: String,
         override val rev: String? = null,
        override val created: Long? = null,
        override val modified: Long? = null,
        override val author: String? = null,
        override val responsible: String? = null,
        override val medicalLocationId: String? = null,
        override val tags: Set<CodeStubDto> = emptySet(),
        override val codes: Set<CodeStubDto> = emptySet(),
        override val endOfLife: Long? = null,
        override val deletionDate: Long? = null,

         val invoiceDate: Long? = null, // yyyyMMdd
         val sentDate: Long? = null,
         val printedDate: Long? = null,
        val invoicingCodes: List<InvoicingCodeDto> = emptyList(),
        @Schema(description = "") val receipts: Map<String, String> = emptyMap(),
         val recipientType: String? = null, // org.taktik.icure.services.external.rest.v1.dto.HealthcarePartyDto,

        // org.taktik.icure.services.external.rest.v1.dto.InsuranceDto, org.taktik.icure.services.external.rest.v1.dto.PatientDto
         val recipientId: String? = null, // for hcps and insurance, patient link happens through secretForeignKeys
        val invoiceReference: String? = null,
        val thirdPartyReference: String? = null,
        val thirdPartyPaymentJustification: String? = null,
        val thirdPartyPaymentReason: String? = null,
        val reason: String? = null,
         val invoiceType: InvoiceTypeDto? = null,
         val sentMediumType: MediumTypeDto? = null,
        val interventionType: InvoiceInterventionTypeDto? = null,
        val groupId: String? = null,
         val paymentType: PaymentTypeDto? = null,
        val paid: Double? = null,
        val payments: List<PaymentDto>? = null,
        val gnotionNihii: String? = null,
        val gnotionSsin: String? = null,
        val gnotionLastName: String? = null,
        val gnotionFirstName: String? = null,
        val gnotionCdHcParty: String? = null,
        val invoicePeriod: Int? = null,
        val careProviderType: String? = null,
        val internshipNihii: String? = null,
        val internshipSsin: String? = null,
        val internshipLastName: String? = null,
        val internshipFirstName: String? = null,
        val internshipCdHcParty: String? = null,
        val internshipCbe: String? = null,
        val supervisorNihii: String? = null,
        val supervisorSsin: String? = null,
        val supervisorLastName: String? = null,
        val supervisorFirstName: String? = null,
        val supervisorCdHcParty: String? = null,
        val supervisorCbe: String? = null,
        val error: String? = null,
        val encounterLocationName: String? = null,
        val encounterLocationNihii: String? = null,
        val encounterLocationNorm: Int? = null,
        val longDelayJustification: Int? = null,
        val correctiveInvoiceId: String? = null,
        val correctedInvoiceId: String? = null,
        val creditNote: Boolean? = null,
        val creditNoteRelatedInvoiceId: String? = null,
        val idDocument: IdentityDocumentReaderDto? = null,

        //eattest cancel
        val cancelReason: String? = null,
        val cancelDate: Long? = null,
        val options: Map<String, String> = emptyMap(),

        override val secretForeignKeys: Set<String> = emptySet(),
        override val cryptedForeignKeys: Map<String, Set<DelegationDto>> = emptyMap(),
        override val delegations: Map<String, Set<DelegationDto>> = emptyMap(),
        override val encryptionKeys: Map<String, Set<DelegationDto>> = emptyMap(),
        override val encryptedSelf: String? = null
) : StoredDocumentDto, ICureDocumentDto<String>, EncryptableDto {
    override fun withIdRev(id: String?, rev: String) = if (id != null) this.copy(id = id, rev = rev) else this.copy(rev = rev)
    override fun withDeletionDate(deletionDate: Long?) = this.copy(deletionDate = deletionDate)
}

