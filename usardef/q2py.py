import datetime
from datetime import time
today = datetime.datetime.now()
hora=(today.time())
if hora >= 6 and hora < 12:
        print("bom dia")
elif hora >= 12 and hora < 18:
        print("boa tarde")
elif hora >= 18 or hora < 6:
        print("boa noite")
