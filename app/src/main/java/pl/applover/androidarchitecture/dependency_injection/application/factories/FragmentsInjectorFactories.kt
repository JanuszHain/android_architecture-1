package pl.applover.androidarchitecture.dependency_injection.application.factories



import android.support.v4.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey

import dagger.multibindings.IntoMap
import pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment.ExampleDialogFragment
import pl.applover.androidarchitecture.views_presenters.example.main.dialog_fragment.ExampleDialogFragmentSubComponent
import pl.applover.androidarchitecture.views_presenters.start.start_fragment.StartFragment
import pl.applover.androidarchitecture.views_presenters.start.start_fragment.StartFragmentSubComponent


/**
 * Created by Janusz Hain on 2018-01-08.
 */
@Module(subcomponents = arrayOf(
//TODO        register your fragments' subcomponents here
        StartFragmentSubComponent::class,
        ExampleDialogFragmentSubComponent::class

))
abstract class FragmentsInjectorFactories {

    //TODO bind your fragments' injection factories here

    @Binds
    @IntoMap
    @FragmentKey(StartFragment::class)
    internal abstract fun bindStartFragmentInjectorFactory(builder: StartFragmentSubComponent.Builder):
            AndroidInjector.Factory<out Fragment>

    @Binds
    @IntoMap
    @FragmentKey(ExampleDialogFragment::class)
    internal abstract fun bindExampleDialogFragmentInjectorFactory(builder: ExampleDialogFragmentSubComponent.Builder):
            AndroidInjector.Factory<out Fragment>
}