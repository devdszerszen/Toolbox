package pl.dszerszen.app.ui.start

import android.util.Log
import androidx.lifecycle.MutableLiveData
import pl.dszerszen.app.base.BaseViewModel

class StartViewModel(): BaseViewModel() {

    val title = MutableLiveData<String>()

    init {
        Log.d("DAMIAN", "StartViewModel initialized successfully!")
        title.postValue("HEJ DAMIAN")
    }
}