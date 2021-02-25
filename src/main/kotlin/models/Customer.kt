package models

import kotlinx.serialization.Serializable

// Definition av kund-klass
@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

// Vår "databas" för att hålla information om kunder
val customerStorage = mutableListOf<Customer>()
