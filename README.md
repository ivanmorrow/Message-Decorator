# Message-Decorator
Objective:
 Apply the Decorator Pattern to a practical application.
Problem:
Different messaging systems require data to be formatted with different filters before it is sent.
For example, an SMS message is (typically) broken down into blocks of less than 153 characters.
Sometimes messages are sent as text (Unicode), sometimes they are formatted as raw Binary. Sometimes
messages are encrypted.
We could create a separate class for each type of message, i.e. EncryptedBinarySMSMessage or
UniCodeMessage or …, but that would lead to an explosion of subclasses. Moreover, if we added
another filter, we would have to create a whole bunch of additional classes.
This problem lends itself to the Decorator Pattern. Instead of creating separate classes for each type, we
can dynamically update the composition of a specific object
