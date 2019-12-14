package com.example.jiajiemu.blockdemo.dagger;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ClassAInject_MembersInjector implements MembersInjector<ClassAInject> {
  private final Provider<ClassB> classBProvider;

  public ClassAInject_MembersInjector(Provider<ClassB> classBProvider) {  
    assert classBProvider != null;
    this.classBProvider = classBProvider;
  }

  @Override
  public void injectMembers(ClassAInject instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.classB = classBProvider.get();
  }

  public static MembersInjector<ClassAInject> create(Provider<ClassB> classBProvider) {  
      return new ClassAInject_MembersInjector(classBProvider);
  }
}

