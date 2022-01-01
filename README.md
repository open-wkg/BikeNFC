使用nfc标签一键启动哈啰电动车(不是共享电动车)，**仅限android手机**

## 原理

原理很简单，不是破解的智能支架，只是简单的用nfc打开**哈啰**app的"**一键用车**"页面实现的

## 基本用法

安装 **哈啰** app，下载安装[BikeNFC][release] ，准备一张nfc标签，下载NFC Tools工具或者其他写nfc标签工具(以下以NFC Tools为例)：
[release]: https://github.com/open-wkg/BikeNFC/releases
1. 打开NFC Tools->写->添加记录->个性化URL

2. 输入以下url，点击OK

   ```
   bikenfc://bikenfc.wkg.com/bike
   ```
   
3. 写入nfc标签即可

手机解锁后，直接手机接近nfc标签会直接打开一键用车页面，会自动开关车

## 高级用法

用nfc打开app任意Activity:

确认要打开的Activity名及app包名

```
bikenfc://bikenfc.wkg.com/app?pkg=app的包名&act=Activity名
```

