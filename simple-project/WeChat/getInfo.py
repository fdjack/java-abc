import itchat

Wchat = itchat.auto_login(hotReload=True)
friends = itchat.get_friends()[0:]

print(friends)