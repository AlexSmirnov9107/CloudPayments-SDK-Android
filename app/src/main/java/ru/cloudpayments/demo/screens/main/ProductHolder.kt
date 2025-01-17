package ru.cloudpayments.demo.screens.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_product.view.*

import ru.cloudpayments.demo.models.Product
import ru.cloudpayments.demo.R

class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
	fun bind(item: Product) {
		with(itemView) {
			text_name.text = item.name
			text_price.text = item.price + " " + context.getString(R.string.main_rub)

		}
	}

	companion object {
		fun create(parent: ViewGroup): ProductHolder {
			return ProductHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_product, parent, false))
		}
	}
}