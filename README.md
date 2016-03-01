# ImageLoaderFactory
这个项目统一了图片 显示的方法

# 有什么用？
当我们用了[Android-Universal-Image-Loader](https://github.com/nostra13/Android-Universal-Image-Loader/).加载图片的时候。
突然我们想更换加载图片的框架（[Glide](https://github.com/bumptech/glide)），我们只能去修改我们之前自己再封装Android-Universal-Image-Loader的代码。假如你没有再分装
Android-Universal-Image-Loader，那更可怕，你只能每个activity都去改。
而这个框架是用抽象工厂分装好的，如果你想更换glide框架，只要建立glide的工厂然后进行对应的实现就可以，这样就不用修改原来的代码了。
