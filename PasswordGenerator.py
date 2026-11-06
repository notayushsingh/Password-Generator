import secrets

def generate_password(length, upper, lower, numbers, symbols):
  characters = ""

  if upper:
    characters = characters + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  if lower:
    characters = characters + "abcdefghijklmnopqrstuvwxyz"

  if numbers:
    characters = characters + "0123456789"

  if symbols:
    characters = characters + "!@#$%^&*()_+-="

  if len(characters) == 0:
    raise ValueError("Select at least one character type.")

  password = ""

  for i in range(length):
    index = secrets.randbelow(len(characters))
    password = password + characters[index]

  return password

def main():
  again = True

  while again:
    try:
      length = int(input("Enter password length(8-64): "))

    except ValueError:
      print("Please enter a Valid Integer: ")
      continue

    if length < 8 or length > 64:
      print("Password length must be between 8 and 64.")
      continue

    upper = input("Include uppercase letters? (true/false): ").lower()

    lower = input("Include lowercase letters?(true/false): ").lower()

    numbers = input("Include numbers ?(true/false): ").lower()

    symbols =input("include symbols?(true/false): ").lower()

    upper = upper == "true"
    lower = lower == "true"
    numbers = numbers == "true"
    symbols = symbols == "true"

    if not upper and not lower and not numbers and not symbols:
      print ("Select at least one character type")
      continue

    password = generate_password(length, upper, lower, numbers, symbols)

    print("\nGenerated Password:", password)
    again = input("\nGenerate Another Password?(true/false): ").lower() == "true"
    print()
  
  print("Thank you for using Password Generator!")

if __name__ == "__main__":
  main()
