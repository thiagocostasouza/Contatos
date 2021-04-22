package com.example.contatos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ContactAdapter(val contactsList: ArrayList<Contact>) : RecyclerView.Adapter<ContactsAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapterViewHolder {
       val view = LayoutInflater
           .from(parent.context)
           .inflate(R.layout.contact_view, parent, false)
        return ContactsAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsAdapterViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun getItemCount(): Int = contactsList.size
}