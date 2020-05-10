package pl.dszerszen.toolbox.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<BINDING: ViewDataBinding, VIEW_MODEL: BaseViewModel> : AppCompatActivity() {

    abstract val layout: Int
    abstract val viewModel: VIEW_MODEL
    protected lateinit var binding: BINDING

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout)
        binding.lifecycleOwner = this
        provideBinding()
    }

    abstract fun provideBinding()
}