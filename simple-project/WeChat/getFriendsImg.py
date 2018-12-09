import itchat
import math
import PIL.Image as Image
import os
# hotReload=True  # 使用这个属性，生成一个静态文件itchat.pkl，用于存储登陆的状态。
itchat.auto_login(hotReload=True)
friends = itchat.get_friends(update=True)[0:]
path = 'D:\\pythonInfo\\'
for item in friends:
    # 可以打印item来看其中具体是什么内容，有什么字段
    img = itchat.get_head_img(userName=item['UserName'])
    with open(path + item['NickName'] + '.jpg', 'wb') as f:
        f.write(img)
# 获取好友昵称和签名
info = [(item['NickName'], item['Signature']) for item in friends]
# 获取文件夹中所有的图片
ls = os.listdir(path)
img_num = len(ls)
# 每张小图片宽
size = 60
#每行放几张
lines = 10
# 大图宽
width = 600
# 大图长
height = math.ceil(img_num/10)*60
# 画一个大图，用来放小头像
image = Image.new('RGBA', (width, height))
x = 0
y = 0
for i in range(0, len(ls)):
    img = Image.open(path + info[i][0] + '.jpg')
    img = img.resize((size, size), Image.ANTIALIAS)
    # 向指定位置放缩小后的图片
    image.paste(img, (x * size, y * size))
    x += 1
    if x == lines:
        x = 0
        y += 1
image.save(path + 'friends.jpg')
# 通过文件助手发给自己
itchat.send_image(path + 'friends.jpg', 'filehelper')