package com.example.contatos

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapterViewHolder(item: View) :  RecyclerView.ViewHolder(item)  {

    private val textName :  TextView = item.findViewById(R.id.contact_name)
    private val textPhone: TextView =  item.findViewById(R.id.contact_phone)

    fun bindItem(contact: Contact) {
        textName.text = contact.name
        textPhone.text = contact.phoneNumber
    }

}
