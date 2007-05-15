package org.eclipse.emf.codegen.ecore.templates.edit;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class ItemProviderAdapterFactory
{
  protected static String nl;
  public static synchronized ItemProviderAdapterFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    ItemProviderAdapterFactory result = new ItemProviderAdapterFactory();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>";
  protected final String TEXT_5 = NL + " *" + NL + " * ";
  protected final String TEXT_6 = "Id";
  protected final String TEXT_7 = NL + " */" + NL + "package ";
  protected final String TEXT_8 = ";" + NL;
  protected final String TEXT_9 = NL + NL + "/**" + NL + " * This is the factory that is used to provide the interfaces needed to support Viewers." + NL + " * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}." + NL + " * The adapters also support Eclipse property sheets." + NL + " * Note that most of the adapters are shared among multiple instances." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_10 = " extends ";
  protected final String TEXT_11 = " implements ComposeableAdapterFactory, IChangeNotifier";
  protected final String TEXT_12 = ", ";
  protected final String TEXT_13 = NL + "{";
  protected final String TEXT_14 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_15 = " copyright = ";
  protected final String TEXT_16 = ";";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = NL + "\t/**" + NL + "\t * This keeps track of the root adapter factory that delegates to this adapter factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ComposedAdapterFactory parentAdapterFactory;" + NL + "" + NL + "\t/**" + NL + "\t * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IChangeNotifier changeNotifier = new ChangeNotifier();" + NL;
  protected final String TEXT_19 = NL + "\t/**" + NL + "\t * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_20 = " disposable = new Disposable();" + NL;
  protected final String TEXT_21 = NL + "\t/**" + NL + "\t * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_22 = " supportedTypes = new ";
  protected final String TEXT_23 = "();" + NL + "" + NL + "\t/**" + NL + "\t * This constructs an instance." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_24 = "()" + NL + "\t{";
  protected final String TEXT_25 = NL + "\t\tsupportedTypes.add(";
  protected final String TEXT_26 = ".class);";
  protected final String TEXT_27 = NL + "\t}" + NL;
  protected final String TEXT_28 = NL + "\t/**" + NL + "\t * This keeps track of the factory to which to delegate adapter creation for objects from that package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_29 = " ";
  protected final String TEXT_30 = " = null;" + NL + "" + NL + "\t/**" + NL + "\t * This determines the delegate factory for the package." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_31 = " get";
  protected final String TEXT_32 = "()" + NL + "\t{" + NL + "\t\tif (";
  protected final String TEXT_33 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_34 = " rootAdapterFactory = getRootAdapterFactory();" + NL + "\t\t\tif (rootAdapterFactory instanceof ComposedAdapterFactory)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_35 = " delegateAdapterFactory =" + NL + "\t\t\t\t\t((ComposedAdapterFactory)rootAdapterFactory).getFactoryForType(";
  protected final String TEXT_36 = ".getPackage());" + NL + "\t\t\t\tif (delegateAdapterFactory instanceof ";
  protected final String TEXT_37 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_38 = " = (";
  protected final String TEXT_39 = ")delegateAdapterFactory;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_40 = ";" + NL + "\t}" + NL;
  protected final String TEXT_41 = NL + "\t/**" + NL + "\t * This keeps track of the one adapter used for all {@link ";
  protected final String TEXT_42 = "} instances." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_43 = " ";
  protected final String TEXT_44 = "ItemProvider;" + NL + "" + NL + "\t/**" + NL + "\t * This creates an adapter for a {@link ";
  protected final String TEXT_45 = "}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_46 = NL + "\t@Override";
  protected final String TEXT_47 = NL + "\tpublic Adapter create";
  protected final String TEXT_48 = "Adapter()" + NL + "\t{" + NL + "\t\tif (";
  protected final String TEXT_49 = "ItemProvider == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_50 = "ItemProvider = new ";
  protected final String TEXT_51 = "(this);" + NL + "\t\t}" + NL + "" + NL + "\t\treturn ";
  protected final String TEXT_52 = "ItemProvider;" + NL + "\t}" + NL;
  protected final String TEXT_53 = NL + "\t/**" + NL + "\t * This creates an adapter for a {@link ";
  protected final String TEXT_54 = "}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter create";
  protected final String TEXT_55 = "Adapter()" + NL + "\t{" + NL + "\t\treturn new ";
  protected final String TEXT_56 = "(this);" + NL + "\t}" + NL;
  protected final String TEXT_57 = NL + "\t/**" + NL + "\t * ";
  protected final String TEXT_58 = " of ";
  protected final String TEXT_59 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Adapter create";
  protected final String TEXT_60 = "Adapter()" + NL + "\t{" + NL + "\t\treturn" + NL + "\t\t\tget";
  protected final String TEXT_61 = "() == null ?" + NL + "\t\t\t\tnull :" + NL + "\t\t\t\tget";
  protected final String TEXT_62 = "().create";
  protected final String TEXT_63 = "Adapter();" + NL + "\t}" + NL;
  protected final String TEXT_64 = NL + "\t/**" + NL + "\t * This returns the root adapter factory that contains this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ComposeableAdapterFactory getRootAdapterFactory()" + NL + "\t{" + NL + "\t\treturn parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This sets the composed adapter factory that contains this factory." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)" + NL + "\t{" + NL + "\t\tthis.parentAdapterFactory = parentAdapterFactory;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_65 = NL + "\t@Override";
  protected final String TEXT_66 = NL + "\tpublic boolean isFactoryForType(Object type)" + NL + "\t{" + NL + "\t\treturn supportedTypes.contains(type) || super.isFactoryForType(type);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implementation substitutes the factory itself as the key for the adapter." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_67 = NL + "\t@Override";
  protected final String TEXT_68 = NL + "\tpublic Adapter adapt(Notifier notifier, Object type)" + NL + "\t{" + NL + "\t\treturn super.adapt(notifier, this);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_69 = NL + "\t@Override";
  protected final String TEXT_70 = NL + "\tpublic Object adapt(Object object, Object type)" + NL + "\t{" + NL + "\t\tif (isFactoryForType(type))" + NL + "\t\t{" + NL + "\t\t\tObject adapter = super.adapt(object, type);" + NL + "\t\t\tif (!(type instanceof Class) || (((Class";
  protected final String TEXT_71 = "<?>";
  protected final String TEXT_72 = ")type).isInstance(adapter)))" + NL + "\t\t\t{" + NL + "\t\t\t\treturn adapter;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\treturn null;" + NL + "\t}" + NL;
  protected final String TEXT_73 = NL + "\t/**" + NL + "\t * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void associate(Adapter adapter, Notifier target)" + NL + "\t{" + NL + "\t\tsuper.associate(adapter, target);" + NL + "\t\tif (adapter != null)" + NL + "\t\t{" + NL + "\t\t\tdisposable.add(adapter);" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_74 = NL + "\t/**" + NL + "\t * This adds a listener." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void addListener(INotifyChangedListener notifyChangedListener)" + NL + "\t{" + NL + "\t\tchangeNotifier.addListener(notifyChangedListener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This removes a listener." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void removeListener(INotifyChangedListener notifyChangedListener)" + NL + "\t{" + NL + "\t\tchangeNotifier.removeListener(notifyChangedListener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fireNotifyChanged(Notification notification)" + NL + "\t{" + NL + "\t\tchangeNotifier.fireNotifyChanged(notification);" + NL + "" + NL + "\t\tif (parentAdapterFactory != null)" + NL + "\t\t{" + NL + "\t\t\tparentAdapterFactory.fireNotifyChanged(notification);" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_75 = NL + "\t/**" + NL + "\t * This disposes all of the item providers created by this factory. " + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void dispose()" + NL + "\t{";
  protected final String TEXT_76 = NL + "\t\tdisposable.dispose();";
  protected final String TEXT_77 = NL + "\t\tif (";
  protected final String TEXT_78 = "ItemProvider != null) ";
  protected final String TEXT_79 = "ItemProvider.dispose();";
  protected final String TEXT_80 = NL + "\t}" + NL;
  protected final String TEXT_81 = NL + "}";
  protected final String TEXT_82 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel(); if (false) {/* Trick to import java.util.* without warnings */Iterator.class.getName();}
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    }}
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getProviderPackageName());
    stringBuffer.append(TEXT_8);
    genModel.addImport("org.eclipse.emf.common.notify.Adapter");
    genModel.addImport("org.eclipse.emf.common.notify.Notification");
    genModel.addImport("org.eclipse.emf.common.notify.Notifier");
    genModel.addImport("org.eclipse.emf.edit.provider.ChangeNotifier");
    genModel.addImport("org.eclipse.emf.edit.provider.ComposeableAdapterFactory");
    genModel.addImport("org.eclipse.emf.edit.provider.ComposedAdapterFactory");
    genModel.addImport("org.eclipse.emf.edit.provider.IChangeNotifier");
    genModel.addImport("org.eclipse.emf.edit.provider.IEditingDomainItemProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemLabelProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.IItemPropertySource");
    genModel.addImport("org.eclipse.emf.edit.provider.INotifyChangedListener");
    genModel.addImport("org.eclipse.emf.edit.provider.IStructuredItemContentProvider");
    genModel.addImport("org.eclipse.emf.edit.provider.ITreeItemContentProvider");
    String _ArrayList = genModel.getImportedName(genModel.useGenerics() ? "java.util.ArrayList<java.lang.Object>" : "java.util.ArrayList");
    String _Collection = genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<java.lang.Object>" : "java.util.Collection");
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_11);
    if (genPackage.isDisposableProviderFactory()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.IDisposable"));
    }
    stringBuffer.append(TEXT_13);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    if (genPackage.isDisposableProviderFactory() && genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.edit.provider.Disposable"));
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(_Collection);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(_ArrayList);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_24);
    for (String name : genPackage.getProviderSupportedTypes()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genModel.getImportedName(name));
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    for (GenPackage genDelegate : genPackage.getAdapterDelegatePackages()) {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genPackage.getAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.AdapterFactory"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.AdapterFactory"));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genDelegate.getImportedAdapterFactoryClassName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getUncapAdapterFactoryDelegateName(genDelegate));
    stringBuffer.append(TEXT_40);
    }
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract() && genClass.getProvider() != GenProviderKind.NONE_LITERAL) {
    if (genClass.isProviderSingleton()) {
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_45);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_46);
    }
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_52);
    } else {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_55);
    stringBuffer.append(genClass.getProviderClassName());
    stringBuffer.append(TEXT_56);
    }
    }
    }
    for (GenClass genClass : genPackage.getAdapterDelegateSuperClasses()) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genClass.getItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_65);
    }
    stringBuffer.append(TEXT_66);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_69);
    }
    stringBuffer.append(TEXT_70);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_71);
    }
    stringBuffer.append(TEXT_72);
    if (genPackage.isDisposableProviderFactory() && genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_73);
    }
    stringBuffer.append(TEXT_74);
    if (genPackage.isDisposableProviderFactory()) {
    stringBuffer.append(TEXT_75);
    if (genPackage.hasStatefulProvider()) {
    stringBuffer.append(TEXT_76);
    } else {
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (!genClass.isAbstract() && genClass.isProviderSingleton()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genClass.getUncapName());
    stringBuffer.append(TEXT_79);
    }
    }
    }
    stringBuffer.append(TEXT_80);
    }
    stringBuffer.append(TEXT_81);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_82);
    return stringBuffer.toString();
  }
}
