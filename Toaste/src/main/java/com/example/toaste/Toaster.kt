package com.example.toaste

import android.content.Context
import android.widget.Toast

 class Toaster {
    companion object{
     fun simpleToast(context: Context,msg:String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
    }
}