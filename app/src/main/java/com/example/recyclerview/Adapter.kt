package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class CustomerAdapter(mCtx: Context, val customers: ArrayList<Customer>) : RecyclerView.Adapter<CustomerAdapter.ViewHolder>(){
    val mCtx = mCtx

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val txtName = itemView.textView
        val btnUpdate = itemView.btnUpdate
        val btnDelete = itemView.btnDelete

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return customers.size
    }

    override fun onBindViewHolder(holder: CustomerAdapter.ViewHolder, position: Int) {
        val customer : Customer = customers[position]
        holder.txtName.text = customer.name
    }

}