package com.example.androidproffy.presentation.ui.study

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproffy.presentation.R
import model.teacher.TeacherModel
import java.io.InputStream
import java.net.URL

class StudyRecyclerViewAdapter(private val data: List<TeacherModel>? = null) :
    RecyclerView.Adapter<StudyRecyclerViewAdapter.StudyViewHolder>() {
    inner class StudyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val name: AppCompatTextView = view.findViewById(R.id.tvName)
        val subject: AppCompatTextView = view.findViewById(R.id.tvSubject)
        val description: AppCompatTextView = view.findViewById(R.id.tvDescription)
        val price: AppCompatTextView = view.findViewById(R.id.tvPrice)
        val profileImage: AppCompatImageView = view.findViewById(R.id.ivProfile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.teacher_item, parent, false)
        return StudyViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudyViewHolder, position: Int) {
        holder.name.text = "Vitor Hugo Risso"
        holder.subject.text = "Programação"
        holder.description.text =
            "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad \nminim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea"
        holder.price.text = "R$ 20,00"
        var drawable: Drawable? = null
        var bitmap: Bitmap? = null
        Thread {

            bitmap = BitmapFactory.decodeStream(
                URL("https://github.com/vitor-risso.png").getContent() as InputStream
            )
            drawable = Drawable.createFromStream(
                URL("https://github.com/vitor-risso.png").getContent() as InputStream,
                "src name"
            )
        }.start()
        holder.profileImage.setImageBitmap(bitmap)
    }

    override fun getItemCount(): Int = data?.size ?: 4
}