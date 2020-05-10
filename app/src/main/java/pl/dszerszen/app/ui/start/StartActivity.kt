package pl.dszerszen.app.ui.start

import org.koin.androidx.viewmodel.ext.android.viewModel
import pl.dszerszen.app.R
import pl.dszerszen.app.base.BaseActivity
import pl.dszerszen.app.databinding.ActivityStartBinding

class StartActivity: BaseActivity<ActivityStartBinding, StartViewModel>() {

    override val viewModel by viewModel<StartViewModel>()
    override val layout = R.layout.activity_start
    override fun provideBinding() {
        binding.viewModel = viewModel
    }
}