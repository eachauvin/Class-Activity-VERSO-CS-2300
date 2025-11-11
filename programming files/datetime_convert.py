from datetime import datetime

#Sets the date to 03-17-2022
date_str = "2022-03-17 10:45:30"

#Sets the object to include the hour, minute, and second.
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S')

#Formats the date
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

print(formatted_date)
