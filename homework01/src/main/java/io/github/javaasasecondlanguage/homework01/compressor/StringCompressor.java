package io.github.javaasasecondlanguage.homework01.compressor;

public class StringCompressor {
    /**
     * Given an array of characters, compress it using the following algorithm:
     *
     * Begin with an empty string s.
     * For each group of consecutive repeating characters in chars:
     * If the group's length is 1, append the character to s.
     * Otherwise, append the character followed by the group's length.
     * Return a compressed string.
     * </p>
     * Follow up:
     * Could you solve it using only O(1) extra space?
     * </p>
     * Examples:
     * a -> a
     * aa -> a2
     * aaa -> a3
     * aaabb -> a3b2
     * "" -> ""
     * null -> Illegal argument
     * 234 sdf -> Illegal argument
     *
     * @param str nullable array of chars to compress
     *            str may contain illegal characters
     * @return a compressed array
     * @throws IllegalArgumentException if str is null
     * @throws IllegalArgumentException if any char is not in range 'a'..'z'
     */
    public char[] compress(char[] str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        for (var ch : str) {
            if (ch < 'a' || ch > 'z') {
                throw new IllegalArgumentException("Wrong character in string");
            }
        }

        if (str.length <= 1) {
            return str;
        }

        StringBuilder compress = new StringBuilder();

        for (var i = 1; i < str.length; ++i) {
            compress.append(str[i - 1]);

            Integer count = 1;
            for (; i < str.length && str[i - 1] == str[i]; ++i) {
                ++count;
            }

            if (count >= 2) {
                compress.append(count);
            }
        }

        if (str[str.length - 2] != str[str.length - 1]) {
            compress.append(str[str.length - 1]);
        }

        return compress.toString().toCharArray();
    }
}
