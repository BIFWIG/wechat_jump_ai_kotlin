package App

/**
 * adb所在位置
 */
//val ADB_PATH = "/Users/iosdevlog/Library/Android/sdk/platform-tools/adb"
val ADB_PATH = "D:\\soft\\adb\\adb.exe"

/**
 * 截屏文件所在位置
 */
val SCREENSHOT_LOCATION = "D:\\soft\\adb\\s.png"
val SCREENSHOT_LOCATION_OUT = "D:\\soft\\adb\\s_out.png"
val SCREENSHOT_LOCATION_OUT_DIR = "D:\\soft\\adb\\out\\"

/**
 * 定时器时间,可以根据手机响应速度适当调整，单位毫秒
 */
val TIMER: Long = 5000

/**
 * 移动系数，如果跳的位置不准确，可以适当修改系数，我的手机是1080p，2.2合适.
 */
val MAGIC_NUMBER = 2.2

/**
 * 保存每次处理的截图,用于获取失败情况样本,目前版本识别没有出现失败,错误均出现在移动(点找对了,但是跳的位置不对).
 */
val IS_SAVE_HISTORY = false