package pl.dszerszen.toolbox.ui.start

import org.koin.androidx.viewmodel.ext.android.viewModel
import pl.dszerszen.toolbox.R
import pl.dszerszen.toolbox.base.BaseActivity
import pl.dszerszen.toolbox.databinding.ActivityStartBinding

class StartActivity: BaseActivity<ActivityStartBinding, StartViewModel>() {

    override val viewModel by viewModel<StartViewModel>()
    override val layout = R.layout.activity_start
    override fun provideBinding() {
        binding.viewModel = viewModel
    }
}