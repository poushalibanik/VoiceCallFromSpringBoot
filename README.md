This is a simple application that has a feature to make a call to any mobile number. So, to implement this feature we will use a 3rd party tool named Twilio, which provides feature to make a voice call programmatically.
The project boils down to :
1. Getting necessary authentication details and one's twilio phone number from twilio and assigning them in our main project module
2. Making a static block to initialize the Twilio tool in our Spring Boot application so that twilio gets initialized only at runtime.
3. Implementing Application Runner interface and overriding the run method.Inside the run method creator method will be called.
4. Calling a creator() method on the Object of Call Class (which is defined in the predefined package of Twilio library). In the creator() method we are passing the Phone number to whosoever we want to make a call and our mobile number being generated from Twilio.
5. Run the application and get the call in the desired phone number.
