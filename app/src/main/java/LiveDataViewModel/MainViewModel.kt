package LiveDataViewModel

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private lateinit var timer:CountDownTimer
    private val _seconds = MutableLiveData<Int>()


    fun _seconds():LiveData<Int>
    {
        return _seconds
    }
    fun starttimer()
    {
        timer = object :CountDownTimer(10000,100
        ){
            override fun onFinish() {


            }

            override fun onTick(p0: Long) {
                val timeleft =  p0/1000
                _seconds.value = timeleft.toInt()
            }

        }.start()

    }


    fun stoptimer()
    {
        timer.cancel()
    }
}