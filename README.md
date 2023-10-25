# Number Base Converter (Java)

A Java library for converting numbers between different numeral bases. This library is a useful tool for working with numeral systems like binary, decimal, and hexadecimal.

## Features

- Convert numbers between different numeral bases.
- Supports bases from 2 (binary) to 36 (alphanumeric).
- Provides functions for common conversions:
  - Decimal to Binary
  - Binary to Decimal
  - Decimal to Hexadecimal
  - Hexadecimal to Decimal

## Getting Started

### Installation
You can include this library in your Java project by copying the `ConverterJava.java` file from this repository.

## Usage
To convert numbers between different bases, you can use the `ConverterJava` class provided by the library. Here's an example of how to use it:

```java
String decimalNumber = "42";
String binaryNumber = ConverterJava.convert(decimalNumber, 10, 2);
System.out.println("Binary: " + binaryNumber);
```
This will convert the decimal number "42" to binary.

#### Common Conversions
The library provides convenience methods for common conversions:

- `fromDecimalToBin(int decimal)`: Converts a decimal number to binary.
- `fromBinToDecimal(String bin)`: Converts a binary number to decimal.
- `fromDecimalToHex(int decimal)`: Converts a decimal number to hexadecimal.
- `fromHexToDecimal(String hex)`: Converts a hexadecimal number to decimal.

## Example
Here's an example of how to use the library to convert a number from decimal to binary and back to decimal:

```java
int decimalNumber = 42;
String binaryNumber = ConverterJava.fromDecimalToBin(decimalNumber);
System.out.println("Binary: " + binaryNumber);

int decimalNumberAgain = ConverterJava.fromBinToDecimal(binaryNumber);
System.out.println("Decimal: " + decimalNumberAgain);
```

## License

This project is licensed under the [MIT License](LICENSE).

---

## Developer
This Project was Developed by [c4vxl](https://c4vxl.de)
