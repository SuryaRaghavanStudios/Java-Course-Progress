package Surya;
////import jdk.internal.access.SharedSecrets;
////import jdk.internal.util.ArraysSupport;
////
////import jdk.internat.misc.CDS;
////import jdk.internal.misc.VM;
////import jdk.internal.vm.annotation.IntrinsicCandidate;
////
////import jdk.internal.math.DoubleConsts;
////import jdk.internal.math.FloatingDecimal;
////import jdk.internal.vm.annotation.IntrinsicCandidate;
//
//import java.io.ObjectStreamField;
//import java.io.UnsupportedEncodingException;
//import java.lang.annotation.Native;
//import java.lang.constant.Constable;
//import java.lang.constant.ConstantDesc;
//import java.lang.invoke.MethodHandles;
//import java.nio.charset.Charset;
//import java.util.*;
//import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.UnaryOperator;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//import java.util.stream.StreamSupport;
//
//import static java.lang.String.*;
//import static java.lang.String.UTF16;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Surya");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}


///*
// * Copyright (c) 1994, 2020, Oracle and/or its affiliates. All rights reserved.
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
// *
// * This code is free software; you can redistribute it and/or modify it
// * under the terms of the GNU General Public License version 2 only, as
// * published by the Free Software Foundation.  Oracle designates this
// * particular file as subject to the "Classpath" exception as provided
// * by Oracle in the LICENSE file that accompanied this code.
// *
// * This code is distributed in the hope that it will be useful, but WITHOUT
// * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// * version 2 for more details (a copy is included in the LICENSE file that
// * accompanied this code).
// *
// * You should have received a copy of the GNU General Public License version
// * 2 along with this work; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
// *
// * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// * or visit www.oracle.com if you need additional information or have any
// * questions.
// */
//
//package java.lang;
//
//        import java.io.ObjectStreamField;
//        import java.io.UnsupportedEncodingException;
//        import java.lang.annotation.Native;
//        import java.lang.invoke.MethodHandles;
//        import java.lang.constant.Constable;
//        import java.lang.constant.ConstantDesc;
//        import java.nio.charset.Charset;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.Comparator;
//        import java.util.Formatter;
//        import java.util.List;
//        import java.util.Locale;
//        import java.util.Objects;
//        import java.util.Optional;
//        import java.util.Spliterator;
//        import java.util.StringJoiner;
//        import java.util.function.Function;
//        import java.util.regex.Pattern;
//        import java.util.regex.PatternSyntaxException;
//        import java.util.stream.Collectors;
//        import java.util.stream.IntStream;
//        import java.util.stream.Stream;
//        import java.util.stream.StreamSupport;
//        import jdk.internal.vm.annotation.IntrinsicCandidate;
//        import jdk.internal.vm.annotation.Stable;
//
//        import static java.util.function.Predicate.not;
//
///**
// * The {@code String} class represents character strings. All
// * string literals in Java programs, such as {@code "abc"}, are
// * implemented as instances of this class.
// * <p>
// * Strings are constant; their values cannot be changed after they
// * are created. String buffers support mutable strings.
// * Because String objects are immutable they can be shared. For example:
// * <blockquote><pre>
// *     String str = "abc";
// * </pre></blockquote><p>
// * is equivalent to:
// * <blockquote><pre>
// *     char data[] = {'a', 'b', 'c'};
// *     String str = new String(data);
// * </pre></blockquote><p>
// * Here are some more examples of how strings can be used:
// * <blockquote><pre>
// *     System.out.println("abc");
// *     String cde = "cde";
// *     System.out.println("abc" + cde);
// *     String c = "abc".substring(2, 3);
// *     String d = cde.substring(1, 2);
// * </pre></blockquote>
// * <p>
// * The class {@code String} includes methods for examining
// * individual characters of the sequence, for comparing strings, for
// * searching strings, for extracting substrings, and for creating a
// * copy of a string with all characters translated to uppercase or to
// * lowercase. Case mapping is based on the Unicode Standard version
// * specified by the {@link java.lang.Character Character} class.
// * <p>
// * The Java language provides special support for the string
// * concatenation operator (&nbsp;+&nbsp;), and for conversion of
// * other objects to strings. For additional information on string
// * concatenation and conversion, see <i>The Java Language Specification</i>.
// *
// * <p> Unless otherwise noted, passing a {@code null} argument to a constructor
// * or method in this class will cause a {@link NullPointerException} to be
// * thrown.
// *
// * <p>A {@code String} represents a string in the UTF-16 format
// * in which <em>supplementary characters</em> are represented by <em>surrogate
// * pairs</em> (see the section <a href="Character.html#unicode">Unicode
// * Character Representations</a> in the {@code Character} class for
// * more information).
// * Index values refer to {@code char} code units, so a supplementary
// * character uses two positions in a {@code String}.
// * <p>The {@code String} class provides methods for dealing with
// * Unicode code points (i.e., characters), in addition to those for
// * dealing with Unicode code units (i.e., {@code char} values).
// *
// * <p>Unless otherwise noted, methods for comparing Strings do not take locale
// * into account.  The {@link java.text.Collator} class provides methods for
// * finer-grain, locale-sensitive String comparison.
// *
// * @implNote The implementation of the string concatenation operator is left to
// * the discretion of a Java compiler, as long as the compiler ultimately conforms
// * to <i>The Java Language Specification</i>. For example, the {@code javac} compiler
// * may implement the operator with {@code StringBuffer}, {@code StringBuilder},
// * or {@code java.lang.invoke.StringConcatFactory} depending on the JDK version. The
// * implementation of string conversion is typically through the method {@code toString},
// * defined by {@code Object} and inherited by all classes in Java.
// *
// * @author  Lee Boynton
// * @author  Arthur van Hoff
// * @author  Martin Buchholz
// * @author  Ulf Zibis
// * @see     java.lang.Object#toString()
// * @see     java.lang.StringBuffer
// * @see     java.lang.StringBuilder
// * @see     java.nio.charset.Charset
// * @since   1.0
// * @jls     15.18.1 String Concatenation Operator +
// */
//
//public final class String
//        implements java.io.Serializable, Comparable<java.lang.String>, CharSequence,
//        Constable, ConstantDesc {
//
//    /**
//     * The value is used for character storage.
//     *
//     * @implNote This field is trusted by the VM, and is a subject to
//     * constant folding if String instance is constant. Overwriting this
//     * field after construction will cause problems.
//     *
//     * Additionally, it is marked with {@link Stable} to trust the contents
//     * of the array. No other facility in JDK provides this functionality (yet).
//     * {@link Stable} is safe here, because value is never null.
//     */
//    @Stable
//    private final byte[] value;
//
//    /**
//     * The identifier of the encoding used to encode the bytes in
//     * {@code value}. The supported values in this implementation are
//     *
//     * LATIN1
//     * UTF16
//     *
//     * @implNote This field is trusted by the VM, and is a subject to
//     * constant folding if String instance is constant. Overwriting this
//     * field after construction will cause problems.
//     */
//    private final byte coder;
//
//    /** Cache the hash code for the string */
//    private int hash; // Default to 0
//
//    /**
//     * Cache if the hash has been calculated as actually being zero, enabling
//     * us to avoid recalculating this.
//     */
//    private boolean hashIsZero; // Default to false;
//
//    /** use serialVersionUID from JDK 1.0.2 for interoperability */
//    @java.io.Serial
//    private static final long serialVersionUID = -6849794470754667710L;
//
//    /**
//     * If String compaction is disabled, the bytes in {@code value} are
//     * always encoded in UTF16.
//     *
//     * For methods with several possible implementation paths, when String
//     * compaction is disabled, only one code path is taken.
//     *
//     * The instance field value is generally opaque to optimizing JIT
//     * compilers. Therefore, in performance-sensitive place, an explicit
//     * check of the static boolean {@code COMPACT_STRINGS} is done first
//     * before checking the {@code coder} field since the static boolean
//     * {@code COMPACT_STRINGS} would be constant folded away by an
//     * optimizing JIT compiler. The idioms for these cases are as follows.
//     *
//     * For code such as:
//     *
//     *    if (coder == LATIN1) { ... }
//     *
//     * can be written more optimally as
//     *
//     *    if (coder() == LATIN1) { ... }
//     *
//     * or:
//     *
//     *    if (COMPACT_STRINGS && coder == LATIN1) { ... }
//     *
//     * An optimizing JIT compiler can fold the above conditional as:
//     *
//     *    COMPACT_STRINGS == true  => if (coder == LATIN1) { ... }
//     *    COMPACT_STRINGS == false => if (false)           { ... }
//     *
//     * @implNote
//     * The actual value for this field is injected by JVM. The static
//     * initialization block is used to set the value here to communicate
//     * that this static final field is not statically foldable, and to
//     * avoid any possible circular dependency during vm initialization.
//     */
//    static final boolean COMPACT_STRINGS;
//
//    static {
//        COMPACT_STRINGS = true;
//    }
//
//    /**
//     * Class String is special cased within the Serialization Stream Protocol.
//     *
//     * A String instance is written into an ObjectOutputStream according to
//     * <a href="{@docRoot}/../specs/serialization/protocol.html#stream-elements">
//     * Object Serialization Specification, Section 6.2, "Stream Elements"</a>
//     */
//    @java.io.Serial
//    private static final ObjectStreamField[] serialPersistentFields =
//            new ObjectStreamField[0];
//
//    /**
//     * Initializes a newly created {@code String} object so that it represents
//     * an empty character sequence.  Note that use of this constructor is
//     * unnecessary since Strings are immutable.
//     */
//    public String() {
//        this.value = "".value;
//        this.coder = "".coder;
//    }
//
//    /**
//     * Initializes a newly created {@code String} object so that it represents
//     * the same sequence of characters as the argument; in other words, the
//     * newly created string is a copy of the argument string. Unless an
//     * explicit copy of {@code original} is needed, use of this constructor is
//     * unnecessary since Strings are immutable.
//     *
//     * @param  original
//     *         A {@code String}
//     */
//    @IntrinsicCandidate
//    public String(java.lang.String original) {
//        this.value = original.value;
//        this.coder = original.coder;
//        this.hash = original.hash;
//    }
//
//    /**
//     * Allocates a new {@code String} so that it represents the sequence of
//     * characters currently contained in the character array argument. The
//     * contents of the character array are copied; subsequent modification of
//     * the character array does not affect the newly created string.
//     *
//     * @param  value
//     *         The initial value of the string
//     */
//    public String(char value[]) {
//        this(value, 0, value.length, null);
//    }
//
//    /**
//     * Allocates a new {@code String} that contains characters from a subarray
//     * of the character array argument. The {@code offset} argument is the
//     * index of the first character of the subarray and the {@code count}
//     * argument specifies the length of the subarray. The contents of the
//     * subarray are copied; subsequent modification of the character array does
//     * not affect the newly created string.
//     *
//     * @param  value
//     *         Array that is the source of characters
//     *
//     * @param  offset
//     *         The initial offset
//     *
//     * @param  count
//     *         The length
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code count} is negative, or
//     *          {@code offset} is greater than {@code value.length - count}
//     */
//    public String(char value[], int offset, int count) {
//        this(value, offset, count, rangeCheck(value, offset, count));
//    }
//
//    private static Void rangeCheck(char[] value, int offset, int count) {
//        checkBoundsOffCount(offset, count, value.length);
//        return null;
//    }
//
//    /**
//     * Allocates a new {@code String} that contains characters from a subarray
//     * of the <a href="Character.html#unicode">Unicode code point</a> array
//     * argument.  The {@code offset} argument is the index of the first code
//     * point of the subarray and the {@code count} argument specifies the
//     * length of the subarray.  The contents of the subarray are converted to
//     * {@code char}s; subsequent modification of the {@code int} array does not
//     * affect the newly created string.
//     *
//     * @param  codePoints
//     *         Array that is the source of Unicode code points
//     *
//     * @param  offset
//     *         The initial offset
//     *
//     * @param  count
//     *         The length
//     *
//     * @throws  IllegalArgumentException
//     *          If any invalid Unicode code point is found in {@code
//     *          codePoints}
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code count} is negative, or
//     *          {@code offset} is greater than {@code codePoints.length - count}
//     *
//     * @since  1.5
//     */
//    public String(int[] codePoints, int offset, int count) {
//        checkBoundsOffCount(offset, count, codePoints.length);
//        if (count == 0) {
//            this.value = "".value;
//            this.coder = "".coder;
//            return;
//        }
//        if (COMPACT_STRINGS) {
//            byte[] val = StringLatin1.toBytes(codePoints, offset, count);
//            if (val != null) {
//                this.coder = LATIN1;
//                this.value = val;
//                return;
//            }
//        }
//        this.coder = UTF16;
//        this.value = StringUTF16.toBytes(codePoints, offset, count);
//    }
//
//    /**
//     * Allocates a new {@code String} constructed from a subarray of an array
//     * of 8-bit integer values.
//     *
//     * <p> The {@code offset} argument is the index of the first byte of the
//     * subarray, and the {@code count} argument specifies the length of the
//     * subarray.
//     *
//     * <p> Each {@code byte} in the subarray is converted to a {@code char} as
//     * specified in the {@link #String(byte[],int) String(byte[],int)} constructor.
//     *
//     * @deprecated This method does not properly convert bytes into characters.
//     * As of JDK&nbsp;1.1, the preferred way to do this is via the
//     * {@code String} constructors that take a {@link
//     * java.nio.charset.Charset}, charset name, or that use the platform's
//     * default charset.
//     *
//     * @param  ascii
//     *         The bytes to be converted to characters
//     *
//     * @param  hibyte
//     *         The top 8 bits of each 16-bit Unicode code unit
//     *
//     * @param  offset
//     *         The initial offset
//     * @param  count
//     *         The length
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code count} is negative, or
//     *          {@code offset} is greater than {@code ascii.length - count}
//     *
//     * @see  #String(byte[], int)
//     * @see  #String(byte[], int, int, java.lang.String)
//     * @see  #String(byte[], int, int, java.nio.charset.Charset)
//     * @see  #String(byte[], int, int)
//     * @see  #String(byte[], java.lang.String)
//     * @see  #String(byte[], java.nio.charset.Charset)
//     * @see  #String(byte[])
//     */
//    @Deprecated(since="1.1")
//    public String(byte ascii[], int hibyte, int offset, int count) {
//        checkBoundsOffCount(offset, count, ascii.length);
//        if (count == 0) {
//            this.value = "".value;
//            this.coder = "".coder;
//            return;
//        }
//        if (COMPACT_STRINGS && (byte)hibyte == 0) {
//            this.value = Arrays.copyOfRange(ascii, offset, offset + count);
//            this.coder = LATIN1;
//        } else {
//            hibyte <<= 8;
//            byte[] val = StringUTF16.newBytesFor(count);
//            for (int i = 0; i < count; i++) {
//                StringUTF16.putChar(val, i, hibyte | (ascii[offset++] & 0xff));
//            }
//            this.value = val;
//            this.coder = UTF16;
//        }
//    }
//
//    /**
//     * Allocates a new {@code String} containing characters constructed from
//     * an array of 8-bit integer values. Each character <i>c</i> in the
//     * resulting string is constructed from the corresponding component
//     * <i>b</i> in the byte array such that:
//     *
//     * <blockquote><pre>
//     *     <b><i>c</i></b> == (char)(((hibyte &amp; 0xff) &lt;&lt; 8)
//     *                         | (<b><i>b</i></b> &amp; 0xff))
//     * </pre></blockquote>
//     *
//     * @deprecated  This method does not properly convert bytes into
//     * characters.  As of JDK&nbsp;1.1, the preferred way to do this is via the
//     * {@code String} constructors that take a {@link
//     * java.nio.charset.Charset}, charset name, or that use the platform's
//     * default charset.
//     *
//     * @param  ascii
//     *         The bytes to be converted to characters
//     *
//     * @param  hibyte
//     *         The top 8 bits of each 16-bit Unicode code unit
//     *
//     * @see  #String(byte[], int, int, java.lang.String)
//     * @see  #String(byte[], int, int, java.nio.charset.Charset)
//     * @see  #String(byte[], int, int)
//     * @see  #String(byte[], java.lang.String)
//     * @see  #String(byte[], java.nio.charset.Charset)
//     * @see  #String(byte[])
//     */
//    @Deprecated(since="1.1")
//    public String(byte ascii[], int hibyte) {
//        this(ascii, hibyte, 0, ascii.length);
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified subarray of
//     * bytes using the specified charset.  The length of the new {@code String}
//     * is a function of the charset, and hence may not be equal to the length
//     * of the subarray.
//     *
//     * <p> The behavior of this constructor when the given bytes are not valid
//     * in the given charset is unspecified.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @param  offset
//     *         The index of the first byte to decode
//     *
//     * @param  length
//     *         The number of bytes to decode
//     *
//     * @param  charsetName
//     *         The name of a supported {@linkplain java.nio.charset.Charset
//     *         charset}
//     *
//     * @throws  UnsupportedEncodingException
//     *          If the named charset is not supported
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code length} is negative, or
//     *          {@code offset} is greater than {@code bytes.length - length}
//     *
//     * @since  1.1
//     */
//    public String(byte bytes[], int offset, int length, java.lang.String charsetName)
//            throws UnsupportedEncodingException {
//        if (charsetName == null)
//            throw new NullPointerException("charsetName");
//        checkBoundsOffCount(offset, length, bytes.length);
//        StringCoding.Result ret =
//                StringCoding.decode(charsetName, bytes, offset, length);
//        this.value = ret.value;
//        this.coder = ret.coder;
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified subarray of
//     * bytes using the specified {@linkplain java.nio.charset.Charset charset}.
//     * The length of the new {@code String} is a function of the charset, and
//     * hence may not be equal to the length of the subarray.
//     *
//     * <p> This method always replaces malformed-input and unmappable-character
//     * sequences with this charset's default replacement string.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @param  offset
//     *         The index of the first byte to decode
//     *
//     * @param  length
//     *         The number of bytes to decode
//     *
//     * @param  charset
//     *         The {@linkplain java.nio.charset.Charset charset} to be used to
//     *         decode the {@code bytes}
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code length} is negative, or
//     *          {@code offset} is greater than {@code bytes.length - length}
//     *
//     * @since  1.6
//     */
//    public String(byte bytes[], int offset, int length, Charset charset) {
//        if (charset == null)
//            throw new NullPointerException("charset");
//        checkBoundsOffCount(offset, length, bytes.length);
//        StringCoding.Result ret =
//                StringCoding.decode(charset, bytes, offset, length);
//        this.value = ret.value;
//        this.coder = ret.coder;
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified array of bytes
//     * using the specified {@linkplain java.nio.charset.Charset charset}.  The
//     * length of the new {@code String} is a function of the charset, and hence
//     * may not be equal to the length of the byte array.
//     *
//     * <p> The behavior of this constructor when the given bytes are not valid
//     * in the given charset is unspecified.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @param  charsetName
//     *         The name of a supported {@linkplain java.nio.charset.Charset
//     *         charset}
//     *
//     * @throws  UnsupportedEncodingException
//     *          If the named charset is not supported
//     *
//     * @since  1.1
//     */
//    public String(byte bytes[], java.lang.String charsetName)
//            throws UnsupportedEncodingException {
//        this(bytes, 0, bytes.length, charsetName);
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified array of
//     * bytes using the specified {@linkplain java.nio.charset.Charset charset}.
//     * The length of the new {@code String} is a function of the charset, and
//     * hence may not be equal to the length of the byte array.
//     *
//     * <p> This method always replaces malformed-input and unmappable-character
//     * sequences with this charset's default replacement string.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @param  charset
//     *         The {@linkplain java.nio.charset.Charset charset} to be used to
//     *         decode the {@code bytes}
//     *
//     * @since  1.6
//     */
//    public String(byte bytes[], Charset charset) {
//        this(bytes, 0, bytes.length, charset);
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified subarray of
//     * bytes using the platform's default charset.  The length of the new
//     * {@code String} is a function of the charset, and hence may not be equal
//     * to the length of the subarray.
//     *
//     * <p> The behavior of this constructor when the given bytes are not valid
//     * in the default charset is unspecified.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @param  offset
//     *         The index of the first byte to decode
//     *
//     * @param  length
//     *         The number of bytes to decode
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code length} is negative, or
//     *          {@code offset} is greater than {@code bytes.length - length}
//     *
//     * @since  1.1
//     */
//    public String(byte bytes[], int offset, int length) {
//        checkBoundsOffCount(offset, length, bytes.length);
//        StringCoding.Result ret = StringCoding.decode(bytes, offset, length);
//        this.value = ret.value;
//        this.coder = ret.coder;
//    }
//
//    /**
//     * Constructs a new {@code String} by decoding the specified array of bytes
//     * using the platform's default charset.  The length of the new {@code
//     * String} is a function of the charset, and hence may not be equal to the
//     * length of the byte array.
//     *
//     * <p> The behavior of this constructor when the given bytes are not valid
//     * in the default charset is unspecified.  The {@link
//     * java.nio.charset.CharsetDecoder} class should be used when more control
//     * over the decoding process is required.
//     *
//     * @param  bytes
//     *         The bytes to be decoded into characters
//     *
//     * @since  1.1
//     */
//    public String(byte[] bytes) {
//        this(bytes, 0, bytes.length);
//    }
//
//    /**
//     * Allocates a new string that contains the sequence of characters
//     * currently contained in the string buffer argument. The contents of the
//     * string buffer are copied; subsequent modification of the string buffer
//     * does not affect the newly created string.
//     *
//     * @param  buffer
//     *         A {@code StringBuffer}
//     */
//    public String(StringBuffer buffer) {
//        this(buffer.toString());
//    }
//
//    /**
//     * Allocates a new string that contains the sequence of characters
//     * currently contained in the string builder argument. The contents of the
//     * string builder are copied; subsequent modification of the string builder
//     * does not affect the newly created string.
//     *
//     * <p> This constructor is provided to ease migration to {@code
//     * StringBuilder}. Obtaining a string from a string builder via the {@code
//     * toString} method is likely to run faster and is generally preferred.
//     *
//     * @param   builder
//     *          A {@code StringBuilder}
//     *
//     * @since  1.5
//     */
//    public String(StringBuilder builder) {
//        this(builder, null);
//    }
//
//    /**
//     * Returns the length of this string.
//     * The length is equal to the number of <a href="Character.html#unicode">Unicode
//     * code units</a> in the string.
//     *
//     * @return  the length of the sequence of characters represented by this
//     *          object.
//     */
//    public int length() {
//        return value.length >> coder();
//    }
//
//    /**
//     * Returns {@code true} if, and only if, {@link #length()} is {@code 0}.
//     *
//     * @return {@code true} if {@link #length()} is {@code 0}, otherwise
//     * {@code false}
//     *
//     * @since 1.6
//     */
//    @Override
//    public boolean isEmpty() {
//        return value.length == 0;
//    }
//
//    /**
//     * Returns the {@code char} value at the
//     * specified index. An index ranges from {@code 0} to
//     * {@code length() - 1}. The first {@code char} value of the sequence
//     * is at index {@code 0}, the next at index {@code 1},
//     * and so on, as for array indexing.
//     *
//     * <p>If the {@code char} value specified by the index is a
//     * <a href="Character.html#unicode">surrogate</a>, the surrogate
//     * value is returned.
//     *
//     * @param      index   the index of the {@code char} value.
//     * @return     the {@code char} value at the specified index of this string.
//     *             The first {@code char} value is at index {@code 0}.
//     * @throws     IndexOutOfBoundsException  if the {@code index}
//     *             argument is negative or not less than the length of this
//     *             string.
//     */
//    public char charAt(int index) {
//        if (isLatin1()) {
//            return StringLatin1.charAt(value, index);
//        } else {
//            return StringUTF16.charAt(value, index);
//        }
//    }
//
//    /**
//     * Returns the character (Unicode code point) at the specified
//     * index. The index refers to {@code char} values
//     * (Unicode code units) and ranges from {@code 0} to
//     * {@link #length()}{@code  - 1}.
//     *
//     * <p> If the {@code char} value specified at the given index
//     * is in the high-surrogate range, the following index is less
//     * than the length of this {@code String}, and the
//     * {@code char} value at the following index is in the
//     * low-surrogate range, then the supplementary code point
//     * corresponding to this surrogate pair is returned. Otherwise,
//     * the {@code char} value at the given index is returned.
//     *
//     * @param      index the index to the {@code char} values
//     * @return     the code point value of the character at the
//     *             {@code index}
//     * @throws     IndexOutOfBoundsException  if the {@code index}
//     *             argument is negative or not less than the length of this
//     *             string.
//     * @since      1.5
//     */
//    public int codePointAt(int index) {
//        if (isLatin1()) {
//            checkIndex(index, value.length);
//            return value[index] & 0xff;
//        }
//        int length = value.length >> 1;
//        checkIndex(index, length);
//        return StringUTF16.codePointAt(value, index, length);
//    }
//
//    /**
//     * Returns the character (Unicode code point) before the specified
//     * index. The index refers to {@code char} values
//     * (Unicode code units) and ranges from {@code 1} to {@link
//     * CharSequence#length() length}.
//     *
//     * <p> If the {@code char} value at {@code (index - 1)}
//     * is in the low-surrogate range, {@code (index - 2)} is not
//     * negative, and the {@code char} value at {@code (index -
//     * 2)} is in the high-surrogate range, then the
//     * supplementary code point value of the surrogate pair is
//     * returned. If the {@code char} value at {@code index -
//     * 1} is an unpaired low-surrogate or a high-surrogate, the
//     * surrogate value is returned.
//     *
//     * @param     index the index following the code point that should be returned
//     * @return    the Unicode code point value before the given index.
//     * @throws    IndexOutOfBoundsException if the {@code index}
//     *            argument is less than 1 or greater than the length
//     *            of this string.
//     * @since     1.5
//     */
//    public int codePointBefore(int index) {
//        int i = index - 1;
//        if (i < 0 || i >= length()) {
//            throw new StringIndexOutOfBoundsException(index);
//        }
//        if (isLatin1()) {
//            return (value[i] & 0xff);
//        }
//        return StringUTF16.codePointBefore(value, index);
//    }
//
//    /**
//     * Returns the number of Unicode code points in the specified text
//     * range of this {@code String}. The text range begins at the
//     * specified {@code beginIndex} and extends to the
//     * {@code char} at index {@code endIndex - 1}. Thus the
//     * length (in {@code char}s) of the text range is
//     * {@code endIndex-beginIndex}. Unpaired surrogates within
//     * the text range count as one code point each.
//     *
//     * @param beginIndex the index to the first {@code char} of
//     * the text range.
//     * @param endIndex the index after the last {@code char} of
//     * the text range.
//     * @return the number of Unicode code points in the specified text
//     * range
//     * @throws    IndexOutOfBoundsException if the
//     * {@code beginIndex} is negative, or {@code endIndex}
//     * is larger than the length of this {@code String}, or
//     * {@code beginIndex} is larger than {@code endIndex}.
//     * @since  1.5
//     */
//    public int codePointCount(int beginIndex, int endIndex) {
//        if (beginIndex < 0 || beginIndex > endIndex ||
//                endIndex > length()) {
//            throw new IndexOutOfBoundsException();
//        }
//        if (isLatin1()) {
//            return endIndex - beginIndex;
//        }
//        return StringUTF16.codePointCount(value, beginIndex, endIndex);
//    }
//
//    /**
//     * Returns the index within this {@code String} that is
//     * offset from the given {@code index} by
//     * {@code codePointOffset} code points. Unpaired surrogates
//     * within the text range given by {@code index} and
//     * {@code codePointOffset} count as one code point each.
//     *
//     * @param index the index to be offset
//     * @param codePointOffset the offset in code points
//     * @return the index within this {@code String}
//     * @throws    IndexOutOfBoundsException if {@code index}
//     *   is negative or larger then the length of this
//     *   {@code String}, or if {@code codePointOffset} is positive
//     *   and the substring starting with {@code index} has fewer
//     *   than {@code codePointOffset} code points,
//     *   or if {@code codePointOffset} is negative and the substring
//     *   before {@code index} has fewer than the absolute value
//     *   of {@code codePointOffset} code points.
//     * @since 1.5
//     */
//    public int offsetByCodePoints(int index, int codePointOffset) {
//        if (index < 0 || index > length()) {
//            throw new IndexOutOfBoundsException();
//        }
//        return Character.offsetByCodePoints(this, index, codePointOffset);
//    }
//
//    /**
//     * Copies characters from this string into the destination character
//     * array.
//     * <p>
//     * The first character to be copied is at index {@code srcBegin};
//     * the last character to be copied is at index {@code srcEnd-1}
//     * (thus the total number of characters to be copied is
//     * {@code srcEnd-srcBegin}). The characters are copied into the
//     * subarray of {@code dst} starting at index {@code dstBegin}
//     * and ending at index:
//     * <blockquote><pre>
//     *     dstBegin + (srcEnd-srcBegin) - 1
//     * </pre></blockquote>
//     *
//     * @param      srcBegin   index of the first character in the string
//     *                        to copy.
//     * @param      srcEnd     index after the last character in the string
//     *                        to copy.
//     * @param      dst        the destination array.
//     * @param      dstBegin   the start offset in the destination array.
//     * @throws    IndexOutOfBoundsException If any of the following
//     *            is true:
//     *            <ul><li>{@code srcBegin} is negative.
//     *            <li>{@code srcBegin} is greater than {@code srcEnd}
//     *            <li>{@code srcEnd} is greater than the length of this
//     *                string
//     *            <li>{@code dstBegin} is negative
//     *            <li>{@code dstBegin+(srcEnd-srcBegin)} is larger than
//     *                {@code dst.length}</ul>
//     */
//    public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin) {
//        checkBoundsBeginEnd(srcBegin, srcEnd, length());
//        checkBoundsOffCount(dstBegin, srcEnd - srcBegin, dst.length);
//        if (isLatin1()) {
//            StringLatin1.getChars(value, srcBegin, srcEnd, dst, dstBegin);
//        } else {
//            StringUTF16.getChars(value, srcBegin, srcEnd, dst, dstBegin);
//        }
//    }
//
//    /**
//     * Copies characters from this string into the destination byte array. Each
//     * byte receives the 8 low-order bits of the corresponding character. The
//     * eight high-order bits of each character are not copied and do not
//     * participate in the transfer in any way.
//     *
//     * <p> The first character to be copied is at index {@code srcBegin}; the
//     * last character to be copied is at index {@code srcEnd-1}.  The total
//     * number of characters to be copied is {@code srcEnd-srcBegin}. The
//     * characters, converted to bytes, are copied into the subarray of {@code
//     * dst} starting at index {@code dstBegin} and ending at index:
//     *
//     * <blockquote><pre>
//     *     dstBegin + (srcEnd-srcBegin) - 1
//     * </pre></blockquote>
//     *
//     * @deprecated  This method does not properly convert characters into
//     * bytes.  As of JDK&nbsp;1.1, the preferred way to do this is via the
//     * {@link #getBytes()} method, which uses the platform's default charset.
//     *
//     * @param  srcBegin
//     *         Index of the first character in the string to copy
//     *
//     * @param  srcEnd
//     *         Index after the last character in the string to copy
//     *
//     * @param  dst
//     *         The destination array
//     *
//     * @param  dstBegin
//     *         The start offset in the destination array
//     *
//     * @throws  IndexOutOfBoundsException
//     *          If any of the following is true:
//     *          <ul>
//     *            <li> {@code srcBegin} is negative
//     *            <li> {@code srcBegin} is greater than {@code srcEnd}
//     *            <li> {@code srcEnd} is greater than the length of this String
//     *            <li> {@code dstBegin} is negative
//     *            <li> {@code dstBegin+(srcEnd-srcBegin)} is larger than {@code
//     *                 dst.length}
//     *          </ul>
//     */
//    @Deprecated(since="1.1")
//    public void getBytes(int srcBegin, int srcEnd, byte dst[], int dstBegin) {
//        checkBoundsBeginEnd(srcBegin, srcEnd, length());
//        Objects.requireNonNull(dst);
//        checkBoundsOffCount(dstBegin, srcEnd - srcBegin, dst.length);
//        if (isLatin1()) {
//            StringLatin1.getBytes(value, srcBegin, srcEnd, dst, dstBegin);
//        } else {
//            StringUTF16.getBytes(value, srcBegin, srcEnd, dst, dstBegin);
//        }
//    }
//
//    /**
//     * Encodes this {@code String} into a sequence of bytes using the named
//     * charset, storing the result into a new byte array.
//     *
//     * <p> The behavior of this method when this string cannot be encoded in
//     * the given charset is unspecified.  The {@link
//     * java.nio.charset.CharsetEncoder} class should be used when more control
//     * over the encoding process is required.
//     *
//     * @param  charsetName
//     *         The name of a supported {@linkplain java.nio.charset.Charset
//     *         charset}
//     *
//     * @return  The resultant byte array
//     *
//     * @throws  UnsupportedEncodingException
//     *          If the named charset is not supported
//     *
//     * @since  1.1
//     */
//    public byte[] getBytes(java.lang.String charsetName)
//            throws UnsupportedEncodingException {
//        if (charsetName == null) throw new NullPointerException();
//        return StringCoding.encode(charsetName, coder(), value);
//    }
//
//    /**
//     * Encodes this {@code String} into a sequence of bytes using the given
//     * {@linkplain java.nio.charset.Charset charset}, storing the result into a
//     * new byte array.
//     *
//     * <p> This method always replaces malformed-input and unmappable-character
//     * sequences with this charset's default replacement byte array.  The
//     * {@link java.nio.charset.CharsetEncoder} class should be used when more
//     * control over the encoding process is required.
//     *
//     * @param  charset
//     *         The {@linkplain java.nio.charset.Charset} to be used to encode
//     *         the {@code String}
//     *
//     * @return  The resultant byte array
//     *
//     * @since  1.6
//     */
//    public byte[] getBytes(Charset charset) {
//        if (charset == null) throw new NullPointerException();
//        return StringCoding.encode(charset, coder(), value);
//    }
//
//    /**
//     * Encodes this {@code String} into a sequence of bytes using the
//     * platform's default charset, storing the result into a new byte array.
//     *
//     * <p> The behavior of this method when this string cannot be encoded in
//     * the default charset is unspecified.  The {@link
//     * java.nio.charset.CharsetEncoder} class should be used when more control
//     * over the encoding process is required.
//     *
//     * @return  The resultant byte array
//     *
//     * @since      1.1
//     */
//    public byte[] getBytes() {
//        return StringCoding.encode(coder(), value);
//    }
//
//    /**
//     * Compares this string to the specified object.  The result is {@code
//     * true} if and only if the argument is not {@code null} and is a {@code
//     * String} object that represents the same sequence of characters as this
//     * object.
//     *
//     * <p>For finer-grained String comparison, refer to
//     * {@link java.text.Collator}.
//     *
//     * @param  anObject
//     *         The object to compare this {@code String} against
//     *
//     * @return  {@code true} if the given object represents a {@code String}
//     *          equivalent to this string, {@code false} otherwise
//     *
//     * @see  #compareTo(java.lang.String)
//     * @see  #equalsIgnoreCase(java.lang.String)
//     */
//    public boolean equals(Object anObject) {
//        if (this == anObject) {
//            return true;
//        }
//        if (anObject instanceof java.lang.String) {
//            java.lang.String aString = (java.lang.String)anObject;
//            if (!COMPACT_STRINGS || this.coder == aString.coder) {
//                return StringLatin1.equals(value, aString.value);
//            }
//        }
//        return false;
//    }
//
//    /**
//     * Compares this string to the specified {@code StringBuffer}.  The result
//     * is {@code true} if and only if this {@code String} represents the same
//     * sequence of characters as the specified {@code StringBuffer}. This method
//     * synchronizes on the {@code StringBuffer}.
//     *
//     * <p>For finer-grained String comparison, refer to
//     * {@link java.text.Collator}.
//     *
//     * @param  sb
//     *         The {@code StringBuffer} to compare this {@code String} against
//     *
//     * @return  {@code true} if this {@code String} represents the same
//     *          sequence of characters as the specified {@code StringBuffer},
//     *          {@code false} otherwise
//     *
//     * @since  1.4
//     */
//    public boolean contentEquals(StringBuffer sb) {
//        return contentEquals((CharSequence)sb);
//    }
//
//    private boolean nonSyncContentEquals(AbstractStringBuilder sb) {
//        int len = length();
//        if (len != sb.length()) {
//            return false;
//        }
//        byte v1[] = value;
//        byte v2[] = sb.getValue();
//        byte coder = coder();
//        if (coder == sb.getCoder()) {
//            int n = v1.length;
//            for (int i = 0; i < n; i++) {
//                if (v1[i] != v2[i]) {
//                    return false;
//                }
//            }
//        } else {
//            if (coder != LATIN1) {  // utf16 str and latin1 abs can never be "equal"
//                return false;
//            }
//            return StringUTF16.contentEquals(v1, v2, len);
//        }
//        return true;
//    }
//
//    /**
//     * Compares this string to the specified {@code CharSequence}.  The
//     * result is {@code true} if and only if this {@code String} represents the
//     * same sequence of char values as the specified sequence. Note that if the
//     * {@code CharSequence} is a {@code StringBuffer} then the method
//     * synchronizes on it.
//     *
//     * <p>For finer-grained String comparison, refer to
//     * {@link java.text.Collator}.
//     *
//     * @param  cs
//     *         The sequence to compare this {@code String} against
//     *
//     * @return  {@code true} if this {@code String} represents the same
//     *          sequence of char values as the specified sequence, {@code
//     *          false} otherwise
//     *
//     * @since  1.5
//     */
//    public boolean contentEquals(CharSequence cs) {
//        // Argument is a StringBuffer, StringBuilder
//        if (cs instanceof AbstractStringBuilder) {
//            if (cs instanceof StringBuffer) {
//                synchronized(cs) {
//                    return nonSyncContentEquals((AbstractStringBuilder)cs);
//                }
//            } else {
//                return nonSyncContentEquals((AbstractStringBuilder)cs);
//            }
//        }
//        // Argument is a String
//        if (cs instanceof java.lang.String) {
//            return equals(cs);
//        }
//        // Argument is a generic CharSequence
//        int n = cs.length();
//        if (n != length()) {
//            return false;
//        }
//        byte[] val = this.value;
//        if (isLatin1()) {
//            for (int i = 0; i < n; i++) {
//                if ((val[i] & 0xff) != cs.charAt(i)) {
//                    return false;
//                }
//            }
//        } else {
//            if (!StringUTF16.contentEquals(val, cs, n)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * Compares this {@code String} to another {@code String}, ignoring case
//     * considerations.  Two strings are considered equal ignoring case if they
//     * are of the same length and corresponding Unicode code points in the two
//     * strings are equal ignoring case.
//     *
//     * <p> Two Unicode code points are considered the same
//     * ignoring case if at least one of the following is true:
//     * <ul>
//     *   <li> The two Unicode code points are the same (as compared by the
//     *        {@code ==} operator)
//     *   <li> Calling {@code Character.toLowerCase(Character.toUpperCase(int))}
//     *        on each Unicode code point produces the same result
//     * </ul>
//     *
//     * <p>Note that this method does <em>not</em> take locale into account, and
//     * will result in unsatisfactory results for certain locales.  The
//     * {@link java.text.Collator} class provides locale-sensitive comparison.
//     *
//     * @param  anotherString
//     *         The {@code String} to compare this {@code String} against
//     *
//     * @return  {@code true} if the argument is not {@code null} and it
//     *          represents an equivalent {@code String} ignoring case; {@code
//     *          false} otherwise
//     *
//     * @see  #equals(Object)
//     * @see  #codePoints()
//     */
//    public boolean equalsIgnoreCase(java.lang.String anotherString) {
//        return (this == anotherString) ? true
//                : (anotherString != null)
//                && (anotherString.length() == length())
//                && regionMatches(true, 0, anotherString, 0, length());
//    }
//
//    /**
//     * Compares two strings lexicographically.
//     * The comparison is based on the Unicode value of each character in
//     * the strings. The character sequence represented by this
//     * {@code String} object is compared lexicographically to the
//     * character sequence represented by the argument string. The result is
//     * a negative integer if this {@code String} object
//     * lexicographically precedes the argument string. The result is a
//     * positive integer if this {@code String} object lexicographically
//     * follows the argument string. The result is zero if the strings
//     * are equal; {@code compareTo} returns {@code 0} exactly when
//     * the {@link #equals(Object)} method would return {@code true}.
//     * <p>
//     * This is the definition of lexicographic ordering. If two strings are
//     * different, then either they have different characters at some index
//     * that is a valid index for both strings, or their lengths are different,
//     * or both. If they have different characters at one or more index
//     * positions, let <i>k</i> be the smallest such index; then the string
//     * whose character at position <i>k</i> has the smaller value, as
//     * determined by using the {@code <} operator, lexicographically precedes the
//     * other string. In this case, {@code compareTo} returns the
//     * difference of the two character values at position {@code k} in
//     * the two string -- that is, the value:
//     * <blockquote><pre>
//     * this.charAt(k)-anotherString.charAt(k)
//     * </pre></blockquote>
//     * If there is no index position at which they differ, then the shorter
//     * string lexicographically precedes the longer string. In this case,
//     * {@code compareTo} returns the difference of the lengths of the
//     * strings -- that is, the value:
//     * <blockquote><pre>
//     * this.length()-anotherString.length()
//     * </pre></blockquote>
//     *
//     * <p>For finer-grained String comparison, refer to
//     * {@link java.text.Collator}.
//     *
//     * @param   anotherString   the {@code String} to be compared.
//     * @return  the value {@code 0} if the argument string is equal to
//     *          this string; a value less than {@code 0} if this string
//     *          is lexicographically less than the string argument; and a
//     *          value greater than {@code 0} if this string is
//     *          lexicographically greater than the string argument.
//     */
//    public int compareTo(java.lang.String anotherString) {
//        byte v1[] = value;
//        byte v2[] = anotherString.value;
//        byte coder = coder();
//        if (coder == anotherString.coder()) {
//            return coder == LATIN1 ? StringLatin1.compareTo(v1, v2)
//                    : StringUTF16.compareTo(v1, v2);
//        }
//        return coder == LATIN1 ? StringLatin1.compareToUTF16(v1, v2)
//                : StringUTF16.compareToLatin1(v1, v2);
//    }
//
//    /**
//     * A Comparator that orders {@code String} objects as by
//     * {@link #compareToIgnoreCase(java.lang.String) compareToIgnoreCase}.
//     * This comparator is serializable.
//     * <p>
//     * Note that this Comparator does <em>not</em> take locale into account,
//     * and will result in an unsatisfactory ordering for certain locales.
//     * The {@link java.text.Collator} class provides locale-sensitive comparison.
//     *
//     * @see     java.text.Collator
//     * @since   1.2
//     */
//    public static final Comparator<java.lang.String> CASE_INSENSITIVE_ORDER
//            = new java.lang.String.CaseInsensitiveComparator();
//
//    /**
//     * CaseInsensitiveComparator for Strings.
//     */
//    private static class CaseInsensitiveComparator
//            implements Comparator<java.lang.String>, java.io.Serializable {
//        // use serialVersionUID from JDK 1.2.2 for interoperability
//        @java.io.Serial
//        private static final long serialVersionUID = 8575799808933029326L;
//
//        public int compare(java.lang.String s1, java.lang.String s2) {
//            byte v1[] = s1.value;
//            byte v2[] = s2.value;
//            byte coder = s1.coder();
//            if (coder == s2.coder()) {
//                return coder == LATIN1 ? StringLatin1.compareToCI(v1, v2)
//                        : StringUTF16.compareToCI(v1, v2);
//            }
//            return coder == LATIN1 ? StringLatin1.compareToCI_UTF16(v1, v2)
//                    : StringUTF16.compareToCI_Latin1(v1, v2);
//        }
//
//        /** Replaces the de-serialized object. */
//        @java.io.Serial
//        private Object readResolve() { return CASE_INSENSITIVE_ORDER; }
//    }
//
//    /**
//     * Compares two strings lexicographically, ignoring case
//     * differences. This method returns an integer whose sign is that of
//     * calling {@code compareTo} with case folded versions of the strings
//     * where case differences have been eliminated by calling
//     * {@code Character.toLowerCase(Character.toUpperCase(int))} on
//     * each Unicode code point.
//     * <p>
//     * Note that this method does <em>not</em> take locale into account,
//     * and will result in an unsatisfactory ordering for certain locales.
//     * The {@link java.text.Collator} class provides locale-sensitive comparison.
//     *
//     * @param   str   the {@code String} to be compared.
//     * @return  a negative integer, zero, or a positive integer as the
//     *          specified String is greater than, equal to, or less
//     *          than this String, ignoring case considerations.
//     * @see     java.text.Collator
//     * @see     #codePoints()
//     * @since   1.2
//     */
//    public int compareToIgnoreCase(java.lang.String str) {
//        return CASE_INSENSITIVE_ORDER.compare(this, str);
//    }
//
//    /**
//     * Tests if two string regions are equal.
//     * <p>
//     * A substring of this {@code String} object is compared to a substring
//     * of the argument other. The result is true if these substrings
//     * represent identical character sequences. The substring of this
//     * {@code String} object to be compared begins at index {@code toffset}
//     * and has length {@code len}. The substring of other to be compared
//     * begins at index {@code ooffset} and has length {@code len}. The
//     * result is {@code false} if and only if at least one of the following
//     * is true:
//     * <ul><li>{@code toffset} is negative.
//     * <li>{@code ooffset} is negative.
//     * <li>{@code toffset+len} is greater than the length of this
//     * {@code String} object.
//     * <li>{@code ooffset+len} is greater than the length of the other
//     * argument.
//     * <li>There is some nonnegative integer <i>k</i> less than {@code len}
//     * such that:
//     * {@code this.charAt(toffset + }<i>k</i>{@code ) != other.charAt(ooffset + }
//     * <i>k</i>{@code )}
//     * </ul>
//     *
//     * <p>Note that this method does <em>not</em> take locale into account.  The
//     * {@link java.text.Collator} class provides locale-sensitive comparison.
//     *
//     * @param   toffset   the starting offset of the subregion in this string.
//     * @param   other     the string argument.
//     * @param   ooffset   the starting offset of the subregion in the string
//     *                    argument.
//     * @param   len       the number of characters to compare.
//     * @return  {@code true} if the specified subregion of this string
//     *          exactly matches the specified subregion of the string argument;
//     *          {@code false} otherwise.
//     */
//    public boolean regionMatches(int toffset, java.lang.String other, int ooffset, int len) {
//        byte tv[] = value;
//        byte ov[] = other.value;
//        // Note: toffset, ooffset, or len might be near -1>>>1.
//        if ((ooffset < 0) || (toffset < 0) ||
//                (toffset > (long)length() - len) ||
//                (ooffset > (long)other.length() - len)) {
//            return false;
//        }
//        byte coder = coder();
//        if (coder == other.coder()) {
//            if (!isLatin1() && (len > 0)) {
//                toffset = toffset << 1;
//                ooffset = ooffset << 1;
//                len = len << 1;
//            }
//            while (len-- > 0) {
//                if (tv[toffset++] != ov[ooffset++]) {
//                    return false;
//                }
//            }
//        } else {
//            if (coder == LATIN1) {
//                while (len-- > 0) {
//                    if (StringLatin1.getChar(tv, toffset++) !=
//                            StringUTF16.getChar(ov, ooffset++)) {
//                        return false;
//                    }
//                }
//            } else {
//                while (len-- > 0) {
//                    if (StringUTF16.getChar(tv, toffset++) !=
//                            StringLatin1.getChar(ov, ooffset++)) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//    /**
//     * Tests if two string regions are equal.
//     * <p>
//     * A substring of this {@code String} object is compared to a substring
//     * of the argument {@code other}. The result is {@code true} if these
//     * substrings represent Unicode code point sequences that are the same,
//     * ignoring case if and only if {@code ignoreCase} is true.
//     * The sequences {@code tsequence} and {@code osequence} are compared,
//     * where {@code tsequence} is the sequence produced as if by calling
//     * {@code this.substring(toffset, len).codePoints()} and {@code osequence}
//     * is the sequence produced as if by calling
//     * {@code other.substring(ooffset, len).codePoints()}.
//     * The result is {@code true} if and only if all of the following
//     * are true:
//     * <ul><li>{@code toffset} is non-negative.
//     * <li>{@code ooffset} is non-negative.
//     * <li>{@code toffset+len} is less than or equal to the length of this
//     * {@code String} object.
//     * <li>{@code ooffset+len} is less than or equal to the length of the other
//     * argument.
//     * <li>if {@code ignoreCase} is {@code false}, all pairs of corresponding Unicode
//     * code points are equal integer values; or if {@code ignoreCase} is {@code true},
//     * {@link Character#toLowerCase(int) Character.toLowerCase(}
//     * {@link Character#toUpperCase(int)}{@code )} on all pairs of Unicode code points
//     * results in equal integer values.
//     * </ul>
//     *
//     * <p>Note that this method does <em>not</em> take locale into account,
//     * and will result in unsatisfactory results for certain locales when
//     * {@code ignoreCase} is {@code true}.  The {@link java.text.Collator} class
//     * provides locale-sensitive comparison.
//     *
//     * @param   ignoreCase   if {@code true}, ignore case when comparing
//     *                       characters.
//     * @param   toffset      the starting offset of the subregion in this
//     *                       string.
//     * @param   other        the string argument.
//     * @param   ooffset      the starting offset of the subregion in the string
//     *                       argument.
//     * @param   len          the number of characters (Unicode code units -
//     *                       16bit {@code char} value) to compare.
//     * @return  {@code true} if the specified subregion of this string
//     *          matches the specified subregion of the string argument;
//     *          {@code false} otherwise. Whether the matching is exact
//     *          or case insensitive depends on the {@code ignoreCase}
//     *          argument.
//     * @see     #codePoints()
//     */
//    public boolean regionMatches(boolean ignoreCase, int toffset,
//                                 java.lang.String other, int ooffset, int len) {
//        if (!ignoreCase) {
//            return regionMatches(toffset, other, ooffset, len);
//        }
//        // Note: toffset, ooffset, or len might be near -1>>>1.
//        if ((ooffset < 0) || (toffset < 0)
//                || (toffset > (long)length() - len)
//                || (ooffset > (long)other.length() - len)) {
//            return false;
//        }
//        byte tv[] = value;
//        byte ov[] = other.value;
//        byte coder = coder();
//        if (coder == other.coder()) {
//            return coder == LATIN1
//                    ? StringLatin1.regionMatchesCI(tv, toffset, ov, ooffset, len)
//                    : StringUTF16.regionMatchesCI(tv, toffset, ov, ooffset, len);
//        }
//        return coder == LATIN1
//                ? StringLatin1.regionMatchesCI_UTF16(tv, toffset, ov, ooffset, len)
//                : StringUTF16.regionMatchesCI_Latin1(tv, toffset, ov, ooffset, len);
//    }
//
//    /**
//     * Tests if the substring of this string beginning at the
//     * specified index starts with the specified prefix.
//     *
//     * @param   prefix    the prefix.
//     * @param   toffset   where to begin looking in this string.
//     * @return  {@code true} if the character sequence represented by the
//     *          argument is a prefix of the substring of this object starting
//     *          at index {@code toffset}; {@code false} otherwise.
//     *          The result is {@code false} if {@code toffset} is
//     *          negative or greater than the length of this
//     *          {@code String} object; otherwise the result is the same
//     *          as the result of the expression
//     *          <pre>
//     *          this.substring(toffset).startsWith(prefix)
//     *          </pre>
//     */
//    public boolean startsWith(java.lang.String prefix, int toffset) {
//        // Note: toffset might be near -1>>>1.
//        if (toffset < 0 || toffset > length() - prefix.length()) {
//            return false;
//        }
//        byte ta[] = value;
//        byte pa[] = prefix.value;
//        int po = 0;
//        int pc = pa.length;
//        byte coder = coder();
//        if (coder == prefix.coder()) {
//            int to = (coder == LATIN1) ? toffset : toffset << 1;
//            while (po < pc) {
//                if (ta[to++] != pa[po++]) {
//                    return false;
//                }
//            }
//        } else {
//            if (coder == LATIN1) {  // && pcoder == UTF16
//                return false;
//            }
//            // coder == UTF16 && pcoder == LATIN1)
//            while (po < pc) {
//                if (StringUTF16.getChar(ta, toffset++) != (pa[po++] & 0xff)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    /**
//     * Tests if this string starts with the specified prefix.
//     *
//     * @param   prefix   the prefix.
//     * @return  {@code true} if the character sequence represented by the
//     *          argument is a prefix of the character sequence represented by
//     *          this string; {@code false} otherwise.
//     *          Note also that {@code true} will be returned if the
//     *          argument is an empty string or is equal to this
//     *          {@code String} object as determined by the
//     *          {@link #equals(Object)} method.
//     * @since   1.0
//     */
//    public boolean startsWith(java.lang.String prefix) {
//        return startsWith(prefix, 0);
//    }
//
//    /**
//     * Tests if this string ends with the specified suffix.
//     *
//     * @param   suffix   the suffix.
//     * @return  {@code true} if the character sequence represented by the
//     *          argument is a suffix of the character sequence represented by
//     *          this object; {@code false} otherwise. Note that the
//     *          result will be {@code true} if the argument is the
//     *          empty string or is equal to this {@code String} object
//     *          as determined by the {@link #equals(Object)} method.
//     */
//    public boolean endsWith(java.lang.String suffix) {
//        return startsWith(suffix, length() - suffix.length());
//    }
//
//    /**
//     * Returns a hash code for this string. The hash code for a
//     * {@code String} object is computed as
//     * <blockquote><pre>
//     * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
//     * </pre></blockquote>
//     * using {@code int} arithmetic, where {@code s[i]} is the
//     * <i>i</i>th character of the string, {@code n} is the length of
//     * the string, and {@code ^} indicates exponentiation.
//     * (The hash value of the empty string is zero.)
//     *
//     * @return  a hash code value for this object.
//     */
//    public int hashCode() {
//        // The hash or hashIsZero fields are subject to a benign data race,
//        // making it crucial to ensure that any observable result of the
//        // calculation in this method stays correct under any possible read of
//        // these fields. Necessary restrictions to allow this to be correct
//        // without explicit memory fences or similar concurrency primitives is
//        // that we can ever only write to one of these two fields for a given
//        // String instance, and that the computation is idempotent and derived
//        // from immutable state
//        int h = hash;
//        if (h == 0 && !hashIsZero) {
//            h = isLatin1() ? StringLatin1.hashCode(value)
//                    : StringUTF16.hashCode(value);
//            if (h == 0) {
//                hashIsZero = true;
//            } else {
//                hash = h;
//            }
//        }
//        return h;
//    }
//
//    /**
//     * Returns the index within this string of the first occurrence of
//     * the specified character. If a character with value
//     * {@code ch} occurs in the character sequence represented by
//     * this {@code String} object, then the index (in Unicode
//     * code units) of the first such occurrence is returned. For
//     * values of {@code ch} in the range from 0 to 0xFFFF
//     * (inclusive), this is the smallest value <i>k</i> such that:
//     * <blockquote><pre>
//     * this.charAt(<i>k</i>) == ch
//     * </pre></blockquote>
//     * is true. For other values of {@code ch}, it is the
//     * smallest value <i>k</i> such that:
//     * <blockquote><pre>
//     * this.codePointAt(<i>k</i>) == ch
//     * </pre></blockquote>
//     * is true. In either case, if no such character occurs in this
//     * string, then {@code -1} is returned.
//     *
//     * @param   ch   a character (Unicode code point).
//     * @return  the index of the first occurrence of the character in the
//     *          character sequence represented by this object, or
//     *          {@code -1} if the character does not occur.
//     */
//    public int indexOf(int ch) {
//        return indexOf(ch, 0);
//    }
//
//    /**
//     * Returns the index within this string of the first occurrence of the
//     * specified character, starting the search at the specified index.
//     * <p>
//     * If a character with value {@code ch} occurs in the
//     * character sequence represented by this {@code String}
//     * object at an index no smaller than {@code fromIndex}, then
//     * the index of the first such occurrence is returned. For values
//     * of {@code ch} in the range from 0 to 0xFFFF (inclusive),
//     * this is the smallest value <i>k</i> such that:
//     * <blockquote><pre>
//     * (this.charAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &gt;= fromIndex)
//     * </pre></blockquote>
//     * is true. For other values of {@code ch}, it is the
//     * smallest value <i>k</i> such that:
//     * <blockquote><pre>
//     * (this.codePointAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &gt;= fromIndex)
//     * </pre></blockquote>
//     * is true. In either case, if no such character occurs in this
//     * string at or after position {@code fromIndex}, then
//     * {@code -1} is returned.
//     *
//     * <p>
//     * There is no restriction on the value of {@code fromIndex}. If it
//     * is negative, it has the same effect as if it were zero: this entire
//     * string may be searched. If it is greater than the length of this
//     * string, it has the same effect as if it were equal to the length of
//     * this string: {@code -1} is returned.
//     *
//     * <p>All indices are specified in {@code char} values
//     * (Unicode code units).
//     *
//     * @param   ch          a character (Unicode code point).
//     * @param   fromIndex   the index to start the search from.
//     * @return  the index of the first occurrence of the character in the
//     *          character sequence represented by this object that is greater
//     *          than or equal to {@code fromIndex}, or {@code -1}
//     *          if the character does not occur.
//     */
//    public int indexOf(int ch, int fromIndex) {
//        return isLatin1() ? StringLatin1.indexOf(value, ch, fromIndex)
//                : StringUTF16.indexOf(value, ch, fromIndex);
//    }
//
//    /**
//     * Returns the index within this string of the last occurrence of
//     * the specified character. For values of {@code ch} in the
//     * range from 0 to 0xFFFF (inclusive), the index (in Unicode code
//     * units) returned is the largest value <i>k</i> such that:
//     * <blockquote><pre>
//     * this.charAt(<i>k</i>) == ch
//     * </pre></blockquote>
//     * is true. For other values of {@code ch}, it is the
//     * largest value <i>k</i> such that:
//     * <blockquote><pre>
//     * this.codePointAt(<i>k</i>) == ch
//     * </pre></blockquote>
//     * is true.  In either case, if no such character occurs in this
//     * string, then {@code -1} is returned.  The
//     * {@code String} is searched backwards starting at the last
//     * character.
//     *
//     * @param   ch   a character (Unicode code point).
//     * @return  the index of the last occurrence of the character in the
//     *          character sequence represented by this object, or
//     *          {@code -1} if the character does not occur.
//     */
//    public int lastIndexOf(int ch) {
//        return lastIndexOf(ch, length() - 1);
//    }
//
//    /**
//     * Returns the index within this string of the last occurrence of
//     * the specified character, searching backward starting at the
//     * specified index. For values of {@code ch} in the range
//     * from 0 to 0xFFFF (inclusive), the index returned is the largest
//     * value <i>k</i> such that:
//     * <blockquote><pre>
//     * (this.charAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &lt;= fromIndex)
//     * </pre></blockquote>
//     * is true. For other values of {@code ch}, it is the
//     * largest value <i>k</i> such that:
//     * <blockquote><pre>
//     * (this.codePointAt(<i>k</i>) == ch) {@code &&} (<i>k</i> &lt;= fromIndex)
//     * </pre></blockquote>
//     * is true. In either case, if no such character occurs in this
//     * string at or before position {@code fromIndex}, then
//     * {@code -1} is returned.
//     *
//     * <p>All indices are specified in {@code char} values
//     * (Unicode code units).
//     *
//     * @param   ch          a character (Unicode code point).
//     * @param   fromIndex   the index to start the search from. There is no
//     *          restriction on the value of {@code fromIndex}. If it is
//     *          greater than or equal to the length of this string, it has
//     *          the same effect as if it were equal to one less than the
//     *          length of this string: this entire string may be searched.
//     *          If it is negative, it has the same effect as if it were -1:
//     *          -1 is returned.
//     * @return  the index of the last occurrence of the character in the
//     *          character sequence represented by this object that is less
//     *          than or equal to {@code fromIndex}, or {@code -1}
//     *          if the character does not occur before that point.
//     */
//    public int lastIndexOf(int ch, int fromIndex) {
//        return isLatin1() ? StringLatin1.lastIndexOf(value, ch, fromIndex)
//                : StringUTF16.lastIndexOf(value, ch, fromIndex);
//    }
//
//    /**
//     * Returns the index within this string of the first occurrence of the
//     * specified substring.
//     *
//     * <p>The returned index is the smallest value {@code k} for which:
//     * <pre>{@code
//     * this.startsWith(str, k)
//     * }</pre>
//     * If no such value of {@code k} exists, then {@code -1} is returned.
//     *
//     * @param   str   the substring to search for.
//     * @return  the index of the first occurrence of the specified substring,
//     *          or {@code -1} if there is no such occurrence.
//     */
//    public int indexOf(java.lang.String str) {
//        byte coder = coder();
//        if (coder == str.coder()) {
//            return isLatin1() ? StringLatin1.indexOf(value, str.value)
//                    : StringUTF16.indexOf(value, str.value);
//        }
//        if (coder == LATIN1) {  // str.coder == UTF16
//            return -1;
//        }
//        return StringUTF16.indexOfLatin1(value, str.value);
//    }
//
//    /**
//     * Returns the index within this string of the first occurrence of the
//     * specified substring, starting at the specified index.
//     *
//     * <p>The returned index is the smallest value {@code k} for which:
//     * <pre>{@code
//     *     k >= Math.min(fromIndex, this.length()) &&
//     *                   this.startsWith(str, k)
//     * }</pre>
//     * If no such value of {@code k} exists, then {@code -1} is returned.
//     *
//     * @param   str         the substring to search for.
//     * @param   fromIndex   the index from which to start the search.
//     * @return  the index of the first occurrence of the specified substring,
//     *          starting at the specified index,
//     *          or {@code -1} if there is no such occurrence.
//     */
//    public int indexOf(java.lang.String str, int fromIndex) {
//        return indexOf(value, coder(), length(), str, fromIndex);
//    }
//
//    /**
//     * Code shared by String and AbstractStringBuilder to do searches. The
//     * source is the character array being searched, and the target
//     * is the string being searched for.
//     *
//     * @param   src       the characters being searched.
//     * @param   srcCoder  the coder of the source string.
//     * @param   srcCount  length of the source string.
//     * @param   tgtStr    the characters being searched for.
//     * @param   fromIndex the index to begin searching from.
//     */
//    static int indexOf(byte[] src, byte srcCoder, int srcCount,
//                       java.lang.String tgtStr, int fromIndex) {
//        byte[] tgt    = tgtStr.value;
//        byte tgtCoder = tgtStr.coder();
//        int tgtCount  = tgtStr.length();
//
//        if (fromIndex >= srcCount) {
//            return (tgtCount == 0 ? srcCount : -1);
//        }
//        if (fromIndex < 0) {
//            fromIndex = 0;
//        }
//        if (tgtCount == 0) {
//            return fromIndex;
//        }
//        if (tgtCount > srcCount) {
//            return -1;
//        }
//        if (srcCoder == tgtCoder) {
//            return srcCoder == LATIN1
//                    ? StringLatin1.indexOf(src, srcCount, tgt, tgtCount, fromIndex)
//                    : StringUTF16.indexOf(src, srcCount, tgt, tgtCount, fromIndex);
//        }
//        if (srcCoder == LATIN1) {    //  && tgtCoder == UTF16
//            return -1;
//        }
//        // srcCoder == UTF16 && tgtCoder == LATIN1) {
//        return StringUTF16.indexOfLatin1(src, srcCount, tgt, tgtCount, fromIndex);
//    }
//
//    /**
//     * Returns the index within this string of the last occurrence of the
//     * specified substring.  The last occurrence of the empty string ""
//     * is considered to occur at the index value {@code this.length()}.
//     *
//     * <p>The returned index is the largest value {@code k} for which:
//     * <pre>{@code
//     * this.startsWith(str, k)
//     * }</pre>
//     * If no such value of {@code k} exists, then {@code -1} is returned.
//     *
//     * @param   str   the substring to search for.
//     * @return  the index of the last occurrence of the specified substring,
//     *          or {@code -1} if there is no such occurrence.
//     */
//    public int lastIndexOf(java.lang.String str) {
//        return lastIndexOf(str, length());
//    }
//
//    /**
//     * Returns the index within this string of the last occurrence of the
//     * specified substring, searching backward starting at the specified index.
//     *
//     * <p>The returned index is the largest value {@code k} for which:
//     * <pre>{@code
//     *     k <= Math.min(fromIndex, this.length()) &&
//     *                   this.startsWith(str, k)
//     * }</pre>
//     * If no such value of {@code k} exists, then {@code -1} is returned.
//     *
//     * @param   str         the substring to search for.
//     * @param   fromIndex   the index to start the search from.
//     * @return  the index of the last occurrence of the specified substring,
//     *          searching backward from the specified index,
//     *          or {@code -1} if there is no such occurrence.
//     */
//    public int lastIndexOf(java.lang.String str, int fromIndex) {
//        return lastIndexOf(value, coder(), length(), str, fromIndex);
//    }
//
//    /**
//     * Code shared by String and AbstractStringBuilder to do searches. The
//     * source is the character array being searched, and the target
//     * is the string being searched for.
//     *
//     * @param   src         the characters being searched.
//     * @param   srcCoder    coder handles the mapping between bytes/chars
//     * @param   srcCount    count of the source string.
//     * @param   tgtStr      the characters being searched for.
//     * @param   fromIndex   the index to begin searching from.
//     */
//    static int lastIndexOf(byte[] src, byte srcCoder, int srcCount,
//                           java.lang.String tgtStr, int fromIndex) {
//        byte[] tgt = tgtStr.value;
//        byte tgtCoder = tgtStr.coder();
//        int tgtCount = tgtStr.length();
//        /*
//         * Check arguments; return immediately where possible. For
//         * consistency, don't check for null str.
//         */
//        int rightIndex = srcCount - tgtCount;
//        if (fromIndex > rightIndex) {
//            fromIndex = rightIndex;
//        }
//        if (fromIndex < 0) {
//            return -1;
//        }
//        /* Empty string always matches. */
//        if (tgtCount == 0) {
//            return fromIndex;
//        }
//        if (srcCoder == tgtCoder) {
//            return srcCoder == LATIN1
//                    ? StringLatin1.lastIndexOf(src, srcCount, tgt, tgtCount, fromIndex)
//                    : StringUTF16.lastIndexOf(src, srcCount, tgt, tgtCount, fromIndex);
//        }
//        if (srcCoder == LATIN1) {    // && tgtCoder == UTF16
//            return -1;
//        }
//        // srcCoder == UTF16 && tgtCoder == LATIN1
//        return StringUTF16.lastIndexOfLatin1(src, srcCount, tgt, tgtCount, fromIndex);
//    }
//
//    /**
//     * Returns a string that is a substring of this string. The
//     * substring begins with the character at the specified index and
//     * extends to the end of this string. <p>
//     * Examples:
//     * <blockquote><pre>
//     * "unhappy".substring(2) returns "happy"
//     * "Harbison".substring(3) returns "bison"
//     * "emptiness".substring(9) returns "" (an empty string)
//     * </pre></blockquote>
//     *
//     * @param      beginIndex   the beginning index, inclusive.
//     * @return     the specified substring.
//     * @throws     IndexOutOfBoundsException  if
//     *             {@code beginIndex} is negative or larger than the
//     *             length of this {@code String} object.
//     */
//    public java.lang.String substring(int beginIndex) {
//        return substring(beginIndex, length());
//    }
//
//    /**
//     * Returns a string that is a substring of this string. The
//     * substring begins at the specified {@code beginIndex} and
//     * extends to the character at index {@code endIndex - 1}.
//     * Thus the length of the substring is {@code endIndex-beginIndex}.
//     * <p>
//     * Examples:
//     * <blockquote><pre>
//     * "hamburger".substring(4, 8) returns "urge"
//     * "smiles".substring(1, 5) returns "mile"
//     * </pre></blockquote>
//     *
//     * @param      beginIndex   the beginning index, inclusive.
//     * @param      endIndex     the ending index, exclusive.
//     * @return     the specified substring.
//     * @throws     IndexOutOfBoundsException  if the
//     *             {@code beginIndex} is negative, or
//     *             {@code endIndex} is larger than the length of
//     *             this {@code String} object, or
//     *             {@code beginIndex} is larger than
//     *             {@code endIndex}.
//     */
//    public java.lang.String substring(int beginIndex, int endIndex) {
//        int length = length();
//        checkBoundsBeginEnd(beginIndex, endIndex, length);
//        if (beginIndex == 0 && endIndex == length) {
//            return this;
//        }
//        int subLen = endIndex - beginIndex;
//        return isLatin1() ? StringLatin1.newString(value, beginIndex, subLen)
//                : StringUTF16.newString(value, beginIndex, subLen);
//    }
//
//    /**
//     * Returns a character sequence that is a subsequence of this sequence.
//     *
//     * <p> An invocation of this method of the form
//     *
//     * <blockquote><pre>
//     * str.subSequence(begin,&nbsp;end)</pre></blockquote>
//     *
//     * behaves in exactly the same way as the invocation
//     *
//     * <blockquote><pre>
//     * str.substring(begin,&nbsp;end)</pre></blockquote>
//     *
//     * @apiNote
//     * This method is defined so that the {@code String} class can implement
//     * the {@link CharSequence} interface.
//     *
//     * @param   beginIndex   the begin index, inclusive.
//     * @param   endIndex     the end index, exclusive.
//     * @return  the specified subsequence.
//     *
//     * @throws  IndexOutOfBoundsException
//     *          if {@code beginIndex} or {@code endIndex} is negative,
//     *          if {@code endIndex} is greater than {@code length()},
//     *          or if {@code beginIndex} is greater than {@code endIndex}
//     *
//     * @since 1.4
//     */
//    public CharSequence subSequence(int beginIndex, int endIndex) {
//        return this.substring(beginIndex, endIndex);
//    }
//
//    /**
//     * Concatenates the specified string to the end of this string.
//     * <p>
//     * If the length of the argument string is {@code 0}, then this
//     * {@code String} object is returned. Otherwise, a
//     * {@code String} object is returned that represents a character
//     * sequence that is the concatenation of the character sequence
//     * represented by this {@code String} object and the character
//     * sequence represented by the argument string.<p>
//     * Examples:
//     * <blockquote><pre>
//     * "cares".concat("s") returns "caress"
//     * "to".concat("get").concat("her") returns "together"
//     * </pre></blockquote>
//     *
//     * @param   str   the {@code String} that is concatenated to the end
//     *                of this {@code String}.
//     * @return  a string that represents the concatenation of this object's
//     *          characters followed by the string argument's characters.
//     */
//    public java.lang.String concat(java.lang.String str) {
//        if (str.isEmpty()) {
//            return this;
//        }
//        return StringConcatHelper.simpleConcat(this, str);
//    }
//
//    /**
//     * Returns a string resulting from replacing all occurrences of
//     * {@code oldChar} in this string with {@code newChar}.
//     * <p>
//     * If the character {@code oldChar} does not occur in the
//     * character sequence represented by this {@code String} object,
//     * then a reference to this {@code String} object is returned.
//     * Otherwise, a {@code String} object is returned that
//     * represents a character sequence identical to the character sequence
//     * represented by this {@code String} object, except that every
//     * occurrence of {@code oldChar} is replaced by an occurrence
//     * of {@code newChar}.
//     * <p>
//     * Examples:
//     * <blockquote><pre>
//     * "mesquite in your cellar".replace('e', 'o')
//     *         returns "mosquito in your collar"
//     * "the war of baronets".replace('r', 'y')
//     *         returns "the way of bayonets"
//     * "sparring with a purple porpoise".replace('p', 't')
//     *         returns "starring with a turtle tortoise"
//     * "JonL".replace('q', 'x') returns "JonL" (no change)
//     * </pre></blockquote>
//     *
//     * @param   oldChar   the old character.
//     * @param   newChar   the new character.
//     * @return  a string derived from this string by replacing every
//     *          occurrence of {@code oldChar} with {@code newChar}.
//     */
//    public java.lang.String replace(char oldChar, char newChar) {
//        if (oldChar != newChar) {
//            java.lang.String ret = isLatin1() ? StringLatin1.replace(value, oldChar, newChar)
//                    : StringUTF16.replace(value, oldChar, newChar);
//            if (ret != null) {
//                return ret;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Tells whether or not this string matches the given <a
//     * href="../util/regex/Pattern.html#sum">regular expression</a>.
//     *
//     * <p> An invocation of this method of the form
//     * <i>str</i>{@code .matches(}<i>regex</i>{@code )} yields exactly the
//     * same result as the expression
//     *
//     * <blockquote>
//     * {@link java.util.regex.Pattern}.{@link java.util.regex.Pattern#matches(java.lang.String,CharSequence)
//     * matches(<i>regex</i>, <i>str</i>)}
//     * </blockquote>
//     *
//     * @param   regex
//     *          the regular expression to which this string is to be matched
//     *
//     * @return  {@code true} if, and only if, this string matches the
//     *          given regular expression
//     *
//     * @throws  PatternSyntaxException
//     *          if the regular expression's syntax is invalid
//     *
//     * @see java.util.regex.Pattern
//     *
//     * @since 1.4
//     */
//    public boolean matches(java.lang.String regex) {
//        return Pattern.matches(regex, this);
//    }
//
//    /**
//     * Returns true if and only if this string contains the specified
//     * sequence of char values.
//     *
//     * @param s the sequence to search for
//     * @return true if this string contains {@code s}, false otherwise
//     * @since 1.5
//     */
//    public boolean contains(CharSequence s) {
//        return indexOf(s.toString()) >= 0;
//    }
//
//    /**
//     * Replaces the first substring of this string that matches the given <a
//     * href="../util/regex/Pattern.html#sum">regular expression</a> with the
//     * given replacement.
//     *
//     * <p> An invocation of this method of the form
//     * <i>str</i>{@code .replaceFirst(}<i>regex</i>{@code ,} <i>repl</i>{@code )}
//     * yields exactly the same result as the expression
//     *
//     * <blockquote>
//     * <code>
//     * {@link java.util.regex.Pattern}.{@link
//     * java.util.regex.Pattern#compile(java.lang.String) compile}(<i>regex</i>).{@link
//     * java.util.regex.Pattern#matcher(java.lang.CharSequence) matcher}(<i>str</i>).{@link
//     * java.util.regex.Matcher#replaceFirst(java.lang.String) replaceFirst}(<i>repl</i>)
//     * </code>
//     * </blockquote>
//     *
//     *<p>
//     * Note that backslashes ({@code \}) and dollar signs ({@code $}) in the
//     * replacement string may cause the results to be different than if it were
//     * being treated as a literal replacement string; see
//     * {@link java.util.regex.Matcher#replaceFirst}.
//     * Use {@link java.util.regex.Matcher#quoteReplacement} to suppress the special
//     * meaning of these characters, if desired.
//     *
//     * @param   regex
//     *          the regular expression to which this string is to be matched
//     * @param   replacement
//     *          the string to be substituted for the first match
//     *
//     * @return  The resulting {@code String}
//     *
//     * @throws  PatternSyntaxException
//     *          if the regular expression's syntax is invalid
//     *
//     * @see java.util.regex.Pattern
//     *
//     * @since 1.4
//     */
//    public java.lang.String replaceFirst(java.lang.String regex, java.lang.String replacement) {
//        return Pattern.compile(regex).matcher(this).replaceFirst(replacement);
//    }
//
//    /**
//     * Replaces each substring of this string that matches the given <a
//     * href="../util/regex/Pattern.html#sum">regular expression</a> with the
//     * given replacement.
//     *
//     * <p> An invocation of this method of the form
//     * <i>str</i>{@code .replaceAll(}<i>regex</i>{@code ,} <i>repl</i>{@code )}
//     * yields exactly the same result as the expression
//     *
//     * <blockquote>
//     * <code>
//     * {@link java.util.regex.Pattern}.{@link
//     * java.util.regex.Pattern#compile(java.lang.String) compile}(<i>regex</i>).{@link
//     * java.util.regex.Pattern#matcher(java.lang.CharSequence) matcher}(<i>str</i>).{@link
//     * java.util.regex.Matcher#replaceAll(java.lang.String) replaceAll}(<i>repl</i>)
//     * </code>
//     * </blockquote>
//     *
//     *<p>
//     * Note that backslashes ({@code \}) and dollar signs ({@code $}) in the
//     * replacement string may cause the results to be different than if it were
//     * being treated as a literal replacement string; see
//     * {@link java.util.regex.Matcher#replaceAll Matcher.replaceAll}.
//     * Use {@link java.util.regex.Matcher#quoteReplacement} to suppress the special
//     * meaning of these characters, if desired.
//     *
//     * @param   regex
//     *          the regular expression to which this string is to be matched
//     * @param   replacement
//     *          the string to be substituted for each match
//     *
//     * @return  The resulting {@code String}
//     *
//     * @throws  PatternSyntaxException
//     *          if the regular expression's syntax is invalid
//     *
//     * @see java.util.regex.Pattern
//     *
//     * @since 1.4
//     */
//    public java.lang.String replaceAll(java.lang.String regex, java.lang.String replacement) {
//        return Pattern.compile(regex).matcher(this).replaceAll(replacement);
//    }
//
//    /**
//     * Replaces each substring of this string that matches the literal target
//     * sequence with the specified literal replacement sequence. The
//     * replacement proceeds from the beginning of the string to the end, for
//     * example, replacing "aa" with "b" in the string "aaa" will result in
//     * "ba" rather than "ab".
//     *
//     * @param  target The sequence of char values to be replaced
//     * @param  replacement The replacement sequence of char values
//     * @return  The resulting string
//     * @since 1.5
//     */
//    public java.lang.String replace(CharSequence target, CharSequence replacement) {
//        java.lang.String trgtStr = target.toString();
//        java.lang.String replStr = replacement.toString();
//        int thisLen = length();
//        int trgtLen = trgtStr.length();
//        int replLen = replStr.length();
//
//        if (trgtLen > 0) {
//            if (trgtLen == 1 && replLen == 1) {
//                return replace(trgtStr.charAt(0), replStr.charAt(0));
//            }
//
//            boolean thisIsLatin1 = this.isLatin1();
//            boolean trgtIsLatin1 = trgtStr.isLatin1();
//            boolean replIsLatin1 = replStr.isLatin1();
//            java.lang.String ret = (thisIsLatin1 && trgtIsLatin1 && replIsLatin1)
//                    ? StringLatin1.replace(value, thisLen,
//                    trgtStr.value, trgtLen,
//                    replStr.value, replLen)
//                    : StringUTF16.replace(value, thisLen, thisIsLatin1,
//                    trgtStr.value, trgtLen, trgtIsLatin1,
//                    replStr.value, replLen, replIsLatin1);
//            if (ret != null) {
//                return ret;
//            }
//            return this;
//
//        } else { // trgtLen == 0
//            int resultLen;
//            try {
//                resultLen = Math.addExact(thisLen, Math.multiplyExact(
//                        Math.addExact(thisLen, 1), replLen));
//            } catch (ArithmeticException ignored) {
//                throw new OutOfMemoryError("Required length exceeds implementation limit");
//            }
//
//            StringBuilder sb = new StringBuilder(resultLen);
//            sb.append(replStr);
//            for (int i = 0; i < thisLen; ++i) {
//                sb.append(charAt(i)).append(replStr);
//            }
//            return sb.toString();
//        }
//    }
//
//    /**
//     * Splits this string around matches of the given
//     * <a href="../util/regex/Pattern.html#sum">regular expression</a>.
//     *
//     * <p> The array returned by this method contains each substring of this
//     * string that is terminated by another substring that matches the given
//     * expression or is terminated by the end of the string.  The substrings in
//     * the array are in the order in which they occur in this string.  If the
//     * expression does not match any part of the input then the resulting array
//     * has just one element, namely this string.
//     *
//     * <p> When there is a positive-width match at the beginning of this
//     * string then an empty leading substring is included at the beginning
//     * of the resulting array. A zero-width match at the beginning however
//     * never produces such empty leading substring.
//     *
//     * <p> The {@code limit} parameter controls the number of times the
//     * pattern is applied and therefore affects the length of the resulting
//     * array.
//     * <ul>
//     *    <li><p>
//     *    If the <i>limit</i> is positive then the pattern will be applied
//     *    at most <i>limit</i>&nbsp;-&nbsp;1 times, the array's length will be
//     *    no greater than <i>limit</i>, and the array's last entry will contain
//     *    all input beyond the last matched delimiter.</p></li>
//     *
//     *    <li><p>
//     *    If the <i>limit</i> is zero then the pattern will be applied as
//     *    many times as possible, the array can have any length, and trailing
//     *    empty strings will be discarded.</p></li>
//     *
//     *    <li><p>
//     *    If the <i>limit</i> is negative then the pattern will be applied
//     *    as many times as possible and the array can have any length.</p></li>
//     * </ul>
//     *
//     * <p> The string {@code "boo:and:foo"}, for example, yields the
//     * following results with these parameters:
//     *
//     * <blockquote><table class="plain">
//     * <caption style="display:none">Split example showing regex, limit, and result</caption>
//     * <thead>
//     * <tr>
//     *     <th scope="col">Regex</th>
//     *     <th scope="col">Limit</th>
//     *     <th scope="col">Result</th>
//     * </tr>
//     * </thead>
//     * <tbody>
//     * <tr><th scope="row" rowspan="3" style="font-weight:normal">:</th>
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">2</th>
//     *     <td>{@code { "boo", "and:foo" }}</td></tr>
//     * <tr><!-- : -->
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">5</th>
//     *     <td>{@code { "boo", "and", "foo" }}</td></tr>
//     * <tr><!-- : -->
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">-2</th>
//     *     <td>{@code { "boo", "and", "foo" }}</td></tr>
//     * <tr><th scope="row" rowspan="3" style="font-weight:normal">o</th>
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">5</th>
//     *     <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
//     * <tr><!-- o -->
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">-2</th>
//     *     <td>{@code { "b", "", ":and:f", "", "" }}</td></tr>
//     * <tr><!-- o -->
//     *     <th scope="row" style="font-weight:normal; text-align:right; padding-right:1em">0</th>
//     *     <td>{@code { "b", "", ":and:f" }}</td></tr>
//     * </tbody>
//     * </table></blockquote>
//     *
//     * <p> An invocation of this method of the form
//     * <i>str.</i>{@code split(}<i>regex</i>{@code ,}&nbsp;<i>n</i>{@code )}
//     * yields the same result as the expression
//     *
//     * <blockquote>
//     * <code>
//     * {@link java.util.regex.Pattern}.{@link
//     * java.util.regex.Pattern#compile(java.lang.String) compile}(<i>regex</i>).{@link
//     * java.util.regex.Pattern#split(java.lang.CharSequence,int) split}(<i>str</i>,&nbsp;<i>n</i>)
//     * </code>
//     * </blockquote>
//     *
//     *
//     * @param  regex
//     *         the delimiting regular expression
//     *
//     * @param  limit
//     *         the result threshold, as described above
//     *
//     * @return  the array of strings computed by splitting this string
//     *          around matches of the given regular expression
//     *
//     * @throws  PatternSyntaxException
//     *          if the regular expression's syntax is invalid
//     *
//     * @see java.util.regex.Pattern
//     *
//     * @since 1.4
//     */
//    public java.lang.String[] split(java.lang.String regex, int limit) {
//        /* fastpath if the regex is a
//         * (1) one-char String and this character is not one of the
//         *     RegEx's meta characters ".$|()[{^?*+\\", or
//         * (2) two-char String and the first char is the backslash and
//         *     the second is not the ascii digit or ascii letter.
//         */
//        char ch = 0;
//        if (((regex.length() == 1 &&
//                ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1) ||
//                (regex.length() == 2 &&
//                        regex.charAt(0) == '\\' &&
//                        (((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 &&
//                        ((ch-'a')|('z'-ch)) < 0 &&
//                        ((ch-'A')|('Z'-ch)) < 0)) &&
//                (ch < Character.MIN_HIGH_SURROGATE ||
//                        ch > Character.MAX_LOW_SURROGATE))
//        {
//            int off = 0;
//            int next = 0;
//            boolean limited = limit > 0;
//            ArrayList<java.lang.String> list = new ArrayList<>();
//            while ((next = indexOf(ch, off)) != -1) {
//                if (!limited || list.size() < limit - 1) {
//                    list.add(substring(off, next));
//                    off = next + 1;
//                } else {    // last one
//                    //assert (list.size() == limit - 1);
//                    int last = length();
//                    list.add(substring(off, last));
//                    off = last;
//                    break;
//                }
//            }
//            // If no match was found, return this
//            if (off == 0)
//                return new java.lang.String[]{this};
//
//            // Add remaining segment
//            if (!limited || list.size() < limit)
//                list.add(substring(off, length()));
//
//            // Construct result
//            int resultSize = list.size();
//            if (limit == 0) {
//                while (resultSize > 0 && list.get(resultSize - 1).isEmpty()) {
//                    resultSize--;
//                }
//            }
//            java.lang.String[] result = new java.lang.String[resultSize];
//            return list.subList(0, resultSize).toArray(result);
//        }
//        return Pattern.compile(regex).split(this, limit);
//    }
//
//    /**
//     * Splits this string around matches of the given <a
//     * href="../util/regex/Pattern.html#sum">regular expression</a>.
//     *
//     * <p> This method works as if by invoking the two-argument {@link
//     * #split(java.lang.String, int) split} method with the given expression and a limit
//     * argument of zero.  Trailing empty strings are therefore not included in
//     * the resulting array.
//     *
//     * <p> The string {@code "boo:and:foo"}, for example, yields the following
//     * results with these expressions:
//     *
//     * <blockquote><table class="plain">
//     * <caption style="display:none">Split examples showing regex and result</caption>
//     * <thead>
//     * <tr>
//     *  <th scope="col">Regex</th>
//     *  <th scope="col">Result</th>
//     * </tr>
//     * </thead>
//     * <tbody>
//     * <tr><th scope="row" style="text-weight:normal">:</th>
//     *     <td>{@code { "boo", "and", "foo" }}</td></tr>
//     * <tr><th scope="row" style="text-weight:normal">o</th>
//     *     <td>{@code { "b", "", ":and:f" }}</td></tr>
//     * </tbody>
//     * </table></blockquote>
//     *
//     *
//     * @param  regex
//     *         the delimiting regular expression
//     *
//     * @return  the array of strings computed by splitting this string
//     *          around matches of the given regular expression
//     *
//     * @throws  PatternSyntaxException
//     *          if the regular expression's syntax is invalid
//     *
//     * @see java.util.regex.Pattern
//     *
//     * @since 1.4
//     */
//    public java.lang.String[] split(java.lang.String regex) {
//        return split(regex, 0);
//    }
//
//    /**
//     * Returns a new String composed of copies of the
//     * {@code CharSequence elements} joined together with a copy of
//     * the specified {@code delimiter}.
//     *
//     * <blockquote>For example,
//     * <pre>{@code
//     *     String message = String.join("-", "Java", "is", "cool");
//     *     // message returned is: "Java-is-cool"
//     * }</pre></blockquote>
//     *
//     * Note that if an element is null, then {@code "null"} is added.
//     *
//     * @param  delimiter the delimiter that separates each element
//     * @param  elements the elements to join together.
//     *
//     * @return a new {@code String} that is composed of the {@code elements}
//     *         separated by the {@code delimiter}
//     *
//     * @throws NullPointerException If {@code delimiter} or {@code elements}
//     *         is {@code null}
//     *
//     * @see java.util.StringJoiner
//     * @since 1.8
//     */
//    public static java.lang.String join(CharSequence delimiter, CharSequence... elements) {
//        Objects.requireNonNull(delimiter);
//        Objects.requireNonNull(elements);
//        // Number of elements not likely worth Arrays.stream overhead.
//        StringJoiner joiner = new StringJoiner(delimiter);
//        for (CharSequence cs: elements) {
//            joiner.add(cs);
//        }
//        return joiner.toString();
//    }
//
//    /**
//     * Returns a new {@code String} composed of copies of the
//     * {@code CharSequence elements} joined together with a copy of the
//     * specified {@code delimiter}.
//     *
//     * <blockquote>For example,
//     * <pre>{@code
//     *     List<String> strings = List.of("Java", "is", "cool");
//     *     String message = String.join(" ", strings);
//     *     // message returned is: "Java is cool"
//     *
//     *     Set<String> strings =
//     *         new LinkedHashSet<>(List.of("Java", "is", "very", "cool"));
//     *     String message = String.join("-", strings);
//     *     // message returned is: "Java-is-very-cool"
//     * }</pre></blockquote>
//     *
//     * Note that if an individual element is {@code null}, then {@code "null"} is added.
//     *
//     * @param  delimiter a sequence of characters that is used to separate each
//     *         of the {@code elements} in the resulting {@code String}
//     * @param  elements an {@code Iterable} that will have its {@code elements}
//     *         joined together.
//     *
//     * @return a new {@code String} that is composed from the {@code elements}
//     *         argument
//     *
//     * @throws NullPointerException If {@code delimiter} or {@code elements}
//     *         is {@code null}
//     *
//     * @see    #join(CharSequence,CharSequence...)
//     * @see    java.util.StringJoiner
//     * @since 1.8
//     */
//    public static java.lang.String join(CharSequence delimiter,
//                                        Iterable<? extends CharSequence> elements) {
//        Objects.requireNonNull(delimiter);
//        Objects.requireNonNull(elements);
//        StringJoiner joiner = new StringJoiner(delimiter);
//        for (CharSequence cs: elements) {
//            joiner.add(cs);
//        }
//        return joiner.toString();
//    }
//
//    /**
//     * Converts all of the characters in this {@code String} to lower
//     * case using the rules of the given {@code Locale}.  Case mapping is based
//     * on the Unicode Standard version specified by the {@link java.lang.Character Character}
//     * class. Since case mappings are not always 1:1 char mappings, the resulting
//     * {@code String} may be a different length than the original {@code String}.
//     * <p>
//     * Examples of lowercase  mappings are in the following table:
//     * <table class="plain">
//     * <caption style="display:none">Lowercase mapping examples showing language code of locale, upper case, lower case, and description</caption>
//     * <thead>
//     * <tr>
//     *   <th scope="col">Language Code of Locale</th>
//     *   <th scope="col">Upper Case</th>
//     *   <th scope="col">Lower Case</th>
//     *   <th scope="col">Description</th>
//     * </tr>
//     * </thead>
//     * <tbody>
//     * <tr>
//     *   <td>tr (Turkish)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0130</th>
//     *   <td>&#92;u0069</td>
//     *   <td>capital letter I with dot above -&gt; small letter i</td>
//     * </tr>
//     * <tr>
//     *   <td>tr (Turkish)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0049</th>
//     *   <td>&#92;u0131</td>
//     *   <td>capital letter I -&gt; small letter dotless i </td>
//     * </tr>
//     * <tr>
//     *   <td>(all)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">French Fries</th>
//     *   <td>french fries</td>
//     *   <td>lowercased all chars in String</td>
//     * </tr>
//     * <tr>
//     *   <td>(all)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">
//     *       &Iota;&Chi;&Theta;&Upsilon;&Sigma;</th>
//     *   <td>&iota;&chi;&theta;&upsilon;&sigma;</td>
//     *   <td>lowercased all chars in String</td>
//     * </tr>
//     * </tbody>
//     * </table>
//     *
//     * @param locale use the case transformation rules for this locale
//     * @return the {@code String}, converted to lowercase.
//     * @see     java.lang.String#toLowerCase()
//     * @see     java.lang.String#toUpperCase()
//     * @see     java.lang.String#toUpperCase(Locale)
//     * @since   1.1
//     */
//    public java.lang.String toLowerCase(Locale locale) {
//        return isLatin1() ? StringLatin1.toLowerCase(this, value, locale)
//                : StringUTF16.toLowerCase(this, value, locale);
//    }
//
//    /**
//     * Converts all of the characters in this {@code String} to lower
//     * case using the rules of the default locale. This is equivalent to calling
//     * {@code toLowerCase(Locale.getDefault())}.
//     * <p>
//     * <b>Note:</b> This method is locale sensitive, and may produce unexpected
//     * results if used for strings that are intended to be interpreted locale
//     * independently.
//     * Examples are programming language identifiers, protocol keys, and HTML
//     * tags.
//     * For instance, {@code "TITLE".toLowerCase()} in a Turkish locale
//     * returns {@code "t\u005Cu0131tle"}, where '\u005Cu0131' is the
//     * LATIN SMALL LETTER DOTLESS I character.
//     * To obtain correct results for locale insensitive strings, use
//     * {@code toLowerCase(Locale.ROOT)}.
//     *
//     * @return  the {@code String}, converted to lowercase.
//     * @see     java.lang.String#toLowerCase(Locale)
//     */
//    public java.lang.String toLowerCase() {
//        return toLowerCase(Locale.getDefault());
//    }
//
//    /**
//     * Converts all of the characters in this {@code String} to upper
//     * case using the rules of the given {@code Locale}. Case mapping is based
//     * on the Unicode Standard version specified by the {@link java.lang.Character Character}
//     * class. Since case mappings are not always 1:1 char mappings, the resulting
//     * {@code String} may be a different length than the original {@code String}.
//     * <p>
//     * Examples of locale-sensitive and 1:M case mappings are in the following table.
//     *
//     * <table class="plain">
//     * <caption style="display:none">Examples of locale-sensitive and 1:M case mappings. Shows Language code of locale, lower case, upper case, and description.</caption>
//     * <thead>
//     * <tr>
//     *   <th scope="col">Language Code of Locale</th>
//     *   <th scope="col">Lower Case</th>
//     *   <th scope="col">Upper Case</th>
//     *   <th scope="col">Description</th>
//     * </tr>
//     * </thead>
//     * <tbody>
//     * <tr>
//     *   <td>tr (Turkish)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0069</th>
//     *   <td>&#92;u0130</td>
//     *   <td>small letter i -&gt; capital letter I with dot above</td>
//     * </tr>
//     * <tr>
//     *   <td>tr (Turkish)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0131</th>
//     *   <td>&#92;u0049</td>
//     *   <td>small letter dotless i -&gt; capital letter I</td>
//     * </tr>
//     * <tr>
//     *   <td>(all)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u00df</th>
//     *   <td>&#92;u0053 &#92;u0053</td>
//     *   <td>small letter sharp s -&gt; two letters: SS</td>
//     * </tr>
//     * <tr>
//     *   <td>(all)</td>
//     *   <th scope="row" style="font-weight:normal; text-align:left">Fahrvergn&uuml;gen</th>
//     *   <td>FAHRVERGN&Uuml;GEN</td>
//     *   <td></td>
//     * </tr>
//     * </tbody>
//     * </table>
//     * @param locale use the case transformation rules for this locale
//     * @return the {@code String}, converted to uppercase.
//     * @see     java.lang.String#toUpperCase()
//     * @see     java.lang.String#toLowerCase()
//     * @see     java.lang.String#toLowerCase(Locale)
//     * @since   1.1
//     */
//    public java.lang.String toUpperCase(Locale locale) {
//        return isLatin1() ? StringLatin1.toUpperCase(this, value, locale)
//                : StringUTF16.toUpperCase(this, value, locale);
//    }
//
//    /**
//     * Converts all of the characters in this {@code String} to upper
//     * case using the rules of the default locale. This method is equivalent to
//     * {@code toUpperCase(Locale.getDefault())}.
//     * <p>
//     * <b>Note:</b> This method is locale sensitive, and may produce unexpected
//     * results if used for strings that are intended to be interpreted locale
//     * independently.
//     * Examples are programming language identifiers, protocol keys, and HTML
//     * tags.
//     * For instance, {@code "title".toUpperCase()} in a Turkish locale
//     * returns {@code "T\u005Cu0130TLE"}, where '\u005Cu0130' is the
//     * LATIN CAPITAL LETTER I WITH DOT ABOVE character.
//     * To obtain correct results for locale insensitive strings, use
//     * {@code toUpperCase(Locale.ROOT)}.
//     *
//     * @return  the {@code String}, converted to uppercase.
//     * @see     java.lang.String#toUpperCase(Locale)
//     */
//    public java.lang.String toUpperCase() {
//        return toUpperCase(Locale.getDefault());
//    }
//
//    /**
//     * Returns a string whose value is this string, with all leading
//     * and trailing space removed, where space is defined
//     * as any character whose codepoint is less than or equal to
//     * {@code 'U+0020'} (the space character).
//     * <p>
//     * If this {@code String} object represents an empty character
//     * sequence, or the first and last characters of character sequence
//     * represented by this {@code String} object both have codes
//     * that are not space (as defined above), then a
//     * reference to this {@code String} object is returned.
//     * <p>
//     * Otherwise, if all characters in this string are space (as
//     * defined above), then a  {@code String} object representing an
//     * empty string is returned.
//     * <p>
//     * Otherwise, let <i>k</i> be the index of the first character in the
//     * string whose code is not a space (as defined above) and let
//     * <i>m</i> be the index of the last character in the string whose code
//     * is not a space (as defined above). A {@code String}
//     * object is returned, representing the substring of this string that
//     * begins with the character at index <i>k</i> and ends with the
//     * character at index <i>m</i>-that is, the result of
//     * {@code this.substring(k, m + 1)}.
//     * <p>
//     * This method may be used to trim space (as defined above) from
//     * the beginning and end of a string.
//     *
//     * @return  a string whose value is this string, with all leading
//     *          and trailing space removed, or this string if it
//     *          has no leading or trailing space.
//     */
//    public java.lang.String trim() {
//        java.lang.String ret = isLatin1() ? StringLatin1.trim(value)
//                : StringUTF16.trim(value);
//        return ret == null ? this : ret;
//    }
//
//    /**
//     * Returns a string whose value is this string, with all leading
//     * and trailing {@linkplain Character#isWhitespace(int) white space}
//     * removed.
//     * <p>
//     * If this {@code String} object represents an empty string,
//     * or if all code points in this string are
//     * {@linkplain Character#isWhitespace(int) white space}, then an empty string
//     * is returned.
//     * <p>
//     * Otherwise, returns a substring of this string beginning with the first
//     * code point that is not a {@linkplain Character#isWhitespace(int) white space}
//     * up to and including the last code point that is not a
//     * {@linkplain Character#isWhitespace(int) white space}.
//     * <p>
//     * This method may be used to strip
//     * {@linkplain Character#isWhitespace(int) white space} from
//     * the beginning and end of a string.
//     *
//     * @return  a string whose value is this string, with all leading
//     *          and trailing white space removed
//     *
//     * @see Character#isWhitespace(int)
//     *
//     * @since 11
//     */
//    public java.lang.String strip() {
//        java.lang.String ret = isLatin1() ? StringLatin1.strip(value)
//                : StringUTF16.strip(value);
//        return ret == null ? this : ret;
//    }
//
//    /**
//     * Returns a string whose value is this string, with all leading
//     * {@linkplain Character#isWhitespace(int) white space} removed.
//     * <p>
//     * If this {@code String} object represents an empty string,
//     * or if all code points in this string are
//     * {@linkplain Character#isWhitespace(int) white space}, then an empty string
//     * is returned.
//     * <p>
//     * Otherwise, returns a substring of this string beginning with the first
//     * code point that is not a {@linkplain Character#isWhitespace(int) white space}
//     * up to and including the last code point of this string.
//     * <p>
//     * This method may be used to trim
//     * {@linkplain Character#isWhitespace(int) white space} from
//     * the beginning of a string.
//     *
//     * @return  a string whose value is this string, with all leading white
//     *          space removed
//     *
//     * @see Character#isWhitespace(int)
//     *
//     * @since 11
//     */
//    public java.lang.String stripLeading() {
//        java.lang.String ret = isLatin1() ? StringLatin1.stripLeading(value)
//                : StringUTF16.stripLeading(value);
//        return ret == null ? this : ret;
//    }
//
//    /**
//     * Returns a string whose value is this string, with all trailing
//     * {@linkplain Character#isWhitespace(int) white space} removed.
//     * <p>
//     * If this {@code String} object represents an empty string,
//     * or if all characters in this string are
//     * {@linkplain Character#isWhitespace(int) white space}, then an empty string
//     * is returned.
//     * <p>
//     * Otherwise, returns a substring of this string beginning with the first
//     * code point of this string up to and including the last code point
//     * that is not a {@linkplain Character#isWhitespace(int) white space}.
//     * <p>
//     * This method may be used to trim
//     * {@linkplain Character#isWhitespace(int) white space} from
//     * the end of a string.
//     *
//     * @return  a string whose value is this string, with all trailing white
//     *          space removed
//     *
//     * @see Character#isWhitespace(int)
//     *
//     * @since 11
//     */
//    public java.lang.String stripTrailing() {
//        java.lang.String ret = isLatin1() ? StringLatin1.stripTrailing(value)
//                : StringUTF16.stripTrailing(value);
//        return ret == null ? this : ret;
//    }
//
//    /**
//     * Returns {@code true} if the string is empty or contains only
//     * {@linkplain Character#isWhitespace(int) white space} codepoints,
//     * otherwise {@code false}.
//     *
//     * @return {@code true} if the string is empty or contains only
//     *         {@linkplain Character#isWhitespace(int) white space} codepoints,
//     *         otherwise {@code false}
//     *
//     * @see Character#isWhitespace(int)
//     *
//     * @since 11
//     */
//    public boolean isBlank() {
//        return indexOfNonWhitespace() == length();
//    }
//
//    /**
//     * Returns a stream of lines extracted from this string,
//     * separated by line terminators.
//     * <p>
//     * A <i>line terminator</i> is one of the following:
//     * a line feed character {@code "\n"} (U+000A),
//     * a carriage return character {@code "\r"} (U+000D),
//     * or a carriage return followed immediately by a line feed
//     * {@code "\r\n"} (U+000D U+000A).
//     * <p>
//     * A <i>line</i> is either a sequence of zero or more characters
//     * followed by a line terminator, or it is a sequence of one or
//     * more characters followed by the end of the string. A
//     * line does not include the line terminator.
//     * <p>
//     * The stream returned by this method contains the lines from
//     * this string in the order in which they occur.
//     *
//     * @apiNote This definition of <i>line</i> implies that an empty
//     *          string has zero lines and that there is no empty line
//     *          following a line terminator at the end of a string.
//     *
//     * @implNote This method provides better performance than
//     *           split("\R") by supplying elements lazily and
//     *           by faster search of new line terminators.
//     *
//     * @return  the stream of lines extracted from this string
//     *
//     * @since 11
//     */
//    public Stream<java.lang.String> lines() {
//        return isLatin1() ? StringLatin1.lines(value) : StringUTF16.lines(value);
//    }
//
//    /**
//     * Adjusts the indentation of each line of this string based on the value of
//     * {@code n}, and normalizes line termination characters.
//     * <p>
//     * This string is conceptually separated into lines using
//     * {@link java.lang.String#lines()}. Each line is then adjusted as described below
//     * and then suffixed with a line feed {@code "\n"} (U+000A). The resulting
//     * lines are then concatenated and returned.
//     * <p>
//     * If {@code n > 0} then {@code n} spaces (U+0020) are inserted at the
//     * beginning of each line.
//     * <p>
//     * If {@code n < 0} then up to {@code n}
//     * {@linkplain Character#isWhitespace(int) white space characters} are removed
//     * from the beginning of each line. If a given line does not contain
//     * sufficient white space then all leading
//     * {@linkplain Character#isWhitespace(int) white space characters} are removed.
//     * Each white space character is treated as a single character. In
//     * particular, the tab character {@code "\t"} (U+0009) is considered a
//     * single character; it is not expanded.
//     * <p>
//     * If {@code n == 0} then the line remains unchanged. However, line
//     * terminators are still normalized.
//     *
//     * @param n  number of leading
//     *           {@linkplain Character#isWhitespace(int) white space characters}
//     *           to add or remove
//     *
//     * @return string with indentation adjusted and line endings normalized
//     *
//     * @see java.lang.String#lines()
//     * @see java.lang.String#isBlank()
//     * @see Character#isWhitespace(int)
//     *
//     * @since 12
//     */
//    public java.lang.String indent(int n) {
//        if (isEmpty()) {
//            return "";
//        }
//        Stream<java.lang.String> stream = lines();
//        if (n > 0) {
//            final java.lang.String spaces = " ".repeat(n);
//            stream = stream.map(s -> spaces + s);
//        } else if (n == Integer.MIN_VALUE) {
//            stream = stream.map(s -> s.stripLeading());
//        } else if (n < 0) {
//            stream = stream.map(s -> s.substring(Math.min(-n, s.indexOfNonWhitespace())));
//        }
//        return stream.collect(Collectors.joining("\n", "", "\n"));
//    }
//
//    private int indexOfNonWhitespace() {
//        return isLatin1() ? StringLatin1.indexOfNonWhitespace(value)
//                : StringUTF16.indexOfNonWhitespace(value);
//    }
//
//    private int lastIndexOfNonWhitespace() {
//        return isLatin1() ? StringLatin1.lastIndexOfNonWhitespace(value)
//                : StringUTF16.lastIndexOfNonWhitespace(value);
//    }
//
//    /**
//     * Returns a string whose value is this string, with incidental
//     * {@linkplain Character#isWhitespace(int) white space} removed from
//     * the beginning and end of every line.
//     * <p>
//     * Incidental {@linkplain Character#isWhitespace(int) white space}
//     * is often present in a text block to align the content with the opening
//     * delimiter. For example, in the following code, dots represent incidental
//     * {@linkplain Character#isWhitespace(int) white space}:
//     * <blockquote><pre>
//     * String html = """
//     * ..............&lt;html&gt;
//     * ..............    &lt;body&gt;
//     * ..............        &lt;p&gt;Hello, world&lt;/p&gt;
//     * ..............    &lt;/body&gt;
//     * ..............&lt;/html&gt;
//     * ..............""";
//     * </pre></blockquote>
//     * This method treats the incidental
//     * {@linkplain Character#isWhitespace(int) white space} as indentation to be
//     * stripped, producing a string that preserves the relative indentation of
//     * the content. Using | to visualize the start of each line of the string:
//     * <blockquote><pre>
//     * |&lt;html&gt;
//     * |    &lt;body&gt;
//     * |        &lt;p&gt;Hello, world&lt;/p&gt;
//     * |    &lt;/body&gt;
//     * |&lt;/html&gt;
//     * </pre></blockquote>
//     * First, the individual lines of this string are extracted. A <i>line</i>
//     * is a sequence of zero or more characters followed by either a line
//     * terminator or the end of the string.
//     * If the string has at least one line terminator, the last line consists
//     * of the characters between the last terminator and the end of the string.
//     * Otherwise, if the string has no terminators, the last line is the start
//     * of the string to the end of the string, in other words, the entire
//     * string.
//     * A line does not include the line terminator.
//     * <p>
//     * Then, the <i>minimum indentation</i> (min) is determined as follows:
//     * <ul>
//     *   <li><p>For each non-blank line (as defined by {@link java.lang.String#isBlank()}),
//     *   the leading {@linkplain Character#isWhitespace(int) white space}
//     *   characters are counted.</p>
//     *   </li>
//     *   <li><p>The leading {@linkplain Character#isWhitespace(int) white space}
//     *   characters on the last line are also counted even if
//     *   {@linkplain java.lang.String#isBlank() blank}.</p>
//     *   </li>
//     * </ul>
//     * <p>The <i>min</i> value is the smallest of these counts.
//     * <p>
//     * For each {@linkplain java.lang.String#isBlank() non-blank} line, <i>min</i> leading
//     * {@linkplain Character#isWhitespace(int) white space} characters are
//     * removed, and any trailing {@linkplain Character#isWhitespace(int) white
//     * space} characters are removed. {@linkplain java.lang.String#isBlank() Blank} lines
//     * are replaced with the empty string.
//     *
//     * <p>
//     * Finally, the lines are joined into a new string, using the LF character
//     * {@code "\n"} (U+000A) to separate lines.
//     *
//     * @apiNote
//     * This method's primary purpose is to shift a block of lines as far as
//     * possible to the left, while preserving relative indentation. Lines
//     * that were indented the least will thus have no leading
//     * {@linkplain Character#isWhitespace(int) white space}.
//     * The result will have the same number of line terminators as this string.
//     * If this string ends with a line terminator then the result will end
//     * with a line terminator.
//     *
//     * @implSpec
//     * This method treats all {@linkplain Character#isWhitespace(int) white space}
//     * characters as having equal width. As long as the indentation on every
//     * line is consistently composed of the same character sequences, then the
//     * result will be as described above.
//     *
//     * @return string with incidental indentation removed and line
//     *         terminators normalized
//     *
//     * @see java.lang.String#lines()
//     * @see java.lang.String#isBlank()
//     * @see java.lang.String#indent(int)
//     * @see Character#isWhitespace(int)
//     *
//     * @since 15
//     *
//     */
//    public java.lang.String stripIndent() {
//        int length = length();
//        if (length == 0) {
//            return "";
//        }
//        char lastChar = charAt(length - 1);
//        boolean optOut = lastChar == '\n' || lastChar == '\r';
//        List<java.lang.String> lines = lines().collect(Collectors.toList());
//        final int outdent = optOut ? 0 : outdent(lines);
//        return lines.stream()
//                .map(line -> {
//                    int firstNonWhitespace = line.indexOfNonWhitespace();
//                    int lastNonWhitespace = line.lastIndexOfNonWhitespace();
//                    int incidentalWhitespace = Math.min(outdent, firstNonWhitespace);
//                    return firstNonWhitespace > lastNonWhitespace
//                            ? "" : line.substring(incidentalWhitespace, lastNonWhitespace);
//                })
//                .collect(Collectors.joining("\n", "", optOut ? "\n" : ""));
//    }
//
//    private static int outdent(List<java.lang.String> lines) {
//        // Note: outdent is guaranteed to be zero or positive number.
//        // If there isn't a non-blank line then the last must be blank
//        int outdent = Integer.MAX_VALUE;
//        for (java.lang.String line : lines) {
//            int leadingWhitespace = line.indexOfNonWhitespace();
//            if (leadingWhitespace != line.length()) {
//                outdent = Integer.min(outdent, leadingWhitespace);
//            }
//        }
//        java.lang.String lastLine = lines.get(lines.size() - 1);
//        if (lastLine.isBlank()) {
//            outdent = Integer.min(outdent, lastLine.length());
//        }
//        return outdent;
//    }
//
//    /**
//     * Returns a string whose value is this string, with escape sequences
//     * translated as if in a string literal.
//     * <p>
//     * Escape sequences are translated as follows;
//     * <table class="striped">
//     *   <caption style="display:none">Translation</caption>
//     *   <thead>
//     *   <tr>
//     *     <th scope="col">Escape</th>
//     *     <th scope="col">Name</th>
//     *     <th scope="col">Translation</th>
//     *   </tr>
//     *   </thead>
//     *   <tbody>
//     *   <tr>
//     *     <th scope="row">{@code \u005Cb}</th>
//     *     <td>backspace</td>
//     *     <td>{@code U+0008}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005Ct}</th>
//     *     <td>horizontal tab</td>
//     *     <td>{@code U+0009}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005Cn}</th>
//     *     <td>line feed</td>
//     *     <td>{@code U+000A}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005Cf}</th>
//     *     <td>form feed</td>
//     *     <td>{@code U+000C}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005Cr}</th>
//     *     <td>carriage return</td>
//     *     <td>{@code U+000D}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005Cs}</th>
//     *     <td>space</td>
//     *     <td>{@code U+0020}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005C"}</th>
//     *     <td>double quote</td>
//     *     <td>{@code U+0022}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005C'}</th>
//     *     <td>single quote</td>
//     *     <td>{@code U+0027}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005C\u005C}</th>
//     *     <td>backslash</td>
//     *     <td>{@code U+005C}</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005C0 - \u005C377}</th>
//     *     <td>octal escape</td>
//     *     <td>code point equivalents</td>
//     *   </tr>
//     *   <tr>
//     *     <th scope="row">{@code \u005C<line-terminator>}</th>
//     *     <td>continuation</td>
//     *     <td>discard</td>
//     *   </tr>
//     *   </tbody>
//     * </table>
//     *
//     * @implNote
//     * This method does <em>not</em> translate Unicode escapes such as "{@code \u005cu2022}".
//     * Unicode escapes are translated by the Java compiler when reading input characters and
//     * are not part of the string literal specification.
//     *
//     * @throws IllegalArgumentException when an escape sequence is malformed.
//     *
//     * @return String with escape sequences translated.
//     *
//     * @jls 3.10.7 Escape Sequences
//     *
//     * @since 15
//     */
//    public java.lang.String translateEscapes() {
//        if (isEmpty()) {
//            return "";
//        }
//        char[] chars = toCharArray();
//        int length = chars.length;
//        int from = 0;
//        int to = 0;
//        while (from < length) {
//            char ch = chars[from++];
//            if (ch == '\\') {
//                ch = from < length ? chars[from++] : '\0';
//                switch (ch) {
//                    case 'b':
//                        ch = '\b';
//                        break;
//                    case 'f':
//                        ch = '\f';
//                        break;
//                    case 'n':
//                        ch = '\n';
//                        break;
//                    case 'r':
//                        ch = '\r';
//                        break;
//                    case 's':
//                        ch = ' ';
//                        break;
//                    case 't':
//                        ch = '\t';
//                        break;
//                    case '\'':
//                    case '\"':
//                    case '\\':
//                        // as is
//                        break;
//                    case '0': case '1': case '2': case '3':
//                    case '4': case '5': case '6': case '7':
//                        int limit = Integer.min(from + (ch <= '3' ? 2 : 1), length);
//                        int code = ch - '0';
//                        while (from < limit) {
//                            ch = chars[from];
//                            if (ch < '0' || '7' < ch) {
//                                break;
//                            }
//                            from++;
//                            code = (code << 3) | (ch - '0');
//                        }
//                        ch = (char)code;
//                        break;
//                    case '\n':
//                        continue;
//                    case '\r':
//                        if (from < length && chars[from] == '\n') {
//                            from++;
//                        }
//                        continue;
//                    default: {
//                        java.lang.String msg = java.lang.String.format(
//                                "Invalid escape sequence: \\%c \\\\u%04X",
//                                ch, (int)ch);
//                        throw new IllegalArgumentException(msg);
//                    }
//                }
//            }
//
//            chars[to++] = ch;
//        }
//
//        return new java.lang.String(chars, 0, to);
//    }
//
//    /**
//     * This method allows the application of a function to {@code this}
//     * string. The function should expect a single String argument
//     * and produce an {@code R} result.
//     * <p>
//     * Any exception thrown by {@code f.apply()} will be propagated to the
//     * caller.
//     *
//     * @param f    a function to apply
//     *
//     * @param <R>  the type of the result
//     *
//     * @return     the result of applying the function to this string
//     *
//     * @see java.util.function.Function
//     *
//     * @since 12
//     */
//    public <R> R transform(Function<? super java.lang.String, ? extends R> f) {
//        return f.apply(this);
//    }
//
//    /**
//     * This object (which is already a string!) is itself returned.
//     *
//     * @return  the string itself.
//     */
//    public java.lang.String toString() {
//        return this;
//    }
//
//    /**
//     * Returns a stream of {@code int} zero-extending the {@code char} values
//     * from this sequence.  Any char which maps to a <a
//     * href="{@docRoot}/java.base/java/lang/Character.html#unicode">surrogate code
//     * point</a> is passed through uninterpreted.
//     *
//     * @return an IntStream of char values from this sequence
//     * @since 9
//     */
//    @Override
//    public IntStream chars() {
//        return StreamSupport.intStream(
//                isLatin1() ? new StringLatin1.CharsSpliterator(value, Spliterator.IMMUTABLE)
//                        : new StringUTF16.CharsSpliterator(value, Spliterator.IMMUTABLE),
//                false);
//    }
//
//
//    /**
//     * Returns a stream of code point values from this sequence.  Any surrogate
//     * pairs encountered in the sequence are combined as if by {@linkplain
//     * Character#toCodePoint Character.toCodePoint} and the result is passed
//     * to the stream. Any other code units, including ordinary BMP characters,
//     * unpaired surrogates, and undefined code units, are zero-extended to
//     * {@code int} values which are then passed to the stream.
//     *
//     * @return an IntStream of Unicode code points from this sequence
//     * @since 9
//     */
//    @Override
//    public IntStream codePoints() {
//        return StreamSupport.intStream(
//                isLatin1() ? new StringLatin1.CharsSpliterator(value, Spliterator.IMMUTABLE)
//                        : new StringUTF16.CodePointsSpliterator(value, Spliterator.IMMUTABLE),
//                false);
//    }
//
//    /**
//     * Converts this string to a new character array.
//     *
//     * @return  a newly allocated character array whose length is the length
//     *          of this string and whose contents are initialized to contain
//     *          the character sequence represented by this string.
//     */
//    public char[] toCharArray() {
//        return isLatin1() ? StringLatin1.toChars(value)
//                : StringUTF16.toChars(value);
//    }
//
//    /**
//     * Returns a formatted string using the specified format string and
//     * arguments.
//     *
//     * <p> The locale always used is the one returned by {@link
//     * java.util.Locale#getDefault(java.util.Locale.Category)
//     * Locale.getDefault(Locale.Category)} with
//     * {@link java.util.Locale.Category#FORMAT FORMAT} category specified.
//     *
//     * @param  format
//     *         A <a href="../util/Formatter.html#syntax">format string</a>
//     *
//     * @param  args
//     *         Arguments referenced by the format specifiers in the format
//     *         string.  If there are more arguments than format specifiers, the
//     *         extra arguments are ignored.  The number of arguments is
//     *         variable and may be zero.  The maximum number of arguments is
//     *         limited by the maximum dimension of a Java array as defined by
//     *         <cite>The Java Virtual Machine Specification</cite>.
//     *         The behaviour on a
//     *         {@code null} argument depends on the <a
//     *         href="../util/Formatter.html#syntax">conversion</a>.
//     *
//     * @throws  java.util.IllegalFormatException
//     *          If a format string contains an illegal syntax, a format
//     *          specifier that is incompatible with the given arguments,
//     *          insufficient arguments given the format string, or other
//     *          illegal conditions.  For specification of all possible
//     *          formatting errors, see the <a
//     *          href="../util/Formatter.html#detail">Details</a> section of the
//     *          formatter class specification.
//     *
//     * @return  A formatted string
//     *
//     * @see  java.util.Formatter
//     * @since  1.5
//     */
//    public static java.lang.String format(java.lang.String format, Object... args) {
//        return new Formatter().format(format, args).toString();
//    }
//
//    /**
//     * Returns a formatted string using the specified locale, format string,
//     * and arguments.
//     *
//     * @param  l
//     *         The {@linkplain java.util.Locale locale} to apply during
//     *         formatting.  If {@code l} is {@code null} then no localization
//     *         is applied.
//     *
//     * @param  format
//     *         A <a href="../util/Formatter.html#syntax">format string</a>
//     *
//     * @param  args
//     *         Arguments referenced by the format specifiers in the format
//     *         string.  If there are more arguments than format specifiers, the
//     *         extra arguments are ignored.  The number of arguments is
//     *         variable and may be zero.  The maximum number of arguments is
//     *         limited by the maximum dimension of a Java array as defined by
//     *         <cite>The Java Virtual Machine Specification</cite>.
//     *         The behaviour on a
//     *         {@code null} argument depends on the
//     *         <a href="../util/Formatter.html#syntax">conversion</a>.
//     *
//     * @throws  java.util.IllegalFormatException
//     *          If a format string contains an illegal syntax, a format
//     *          specifier that is incompatible with the given arguments,
//     *          insufficient arguments given the format string, or other
//     *          illegal conditions.  For specification of all possible
//     *          formatting errors, see the <a
//     *          href="../util/Formatter.html#detail">Details</a> section of the
//     *          formatter class specification
//     *
//     * @return  A formatted string
//     *
//     * @see  java.util.Formatter
//     * @since  1.5
//     */
//    public static java.lang.String format(Locale l, java.lang.String format, Object... args) {
//        return new Formatter(l).format(format, args).toString();
//    }
//
//    /**
//     * Formats using this string as the format string, and the supplied
//     * arguments.
//     *
//     * @implSpec This method is equivalent to {@code String.format(this, args)}.
//     *
//     * @param  args
//     *         Arguments referenced by the format specifiers in this string.
//     *
//     * @return  A formatted string
//     *
//     * @see  java.lang.String#format(java.lang.String,Object...)
//     * @see  java.util.Formatter
//     *
//     * @since 15
//     *
//     */
//    public java.lang.String formatted(Object... args) {
//        return new Formatter().format(this, args).toString();
//    }
//
//    /**
//     * Returns the string representation of the {@code Object} argument.
//     *
//     * @param   obj   an {@code Object}.
//     * @return  if the argument is {@code null}, then a string equal to
//     *          {@code "null"}; otherwise, the value of
//     *          {@code obj.toString()} is returned.
//     * @see     java.lang.Object#toString()
//     */
//    public static java.lang.String valueOf(Object obj) {
//        return (obj == null) ? "null" : obj.toString();
//    }
//
//    /**
//     * Returns the string representation of the {@code char} array
//     * argument. The contents of the character array are copied; subsequent
//     * modification of the character array does not affect the returned
//     * string.
//     *
//     * @param   data     the character array.
//     * @return  a {@code String} that contains the characters of the
//     *          character array.
//     */
//    public static java.lang.String valueOf(char data[]) {
//        return new java.lang.String(data);
//    }
//
//    /**
//     * Returns the string representation of a specific subarray of the
//     * {@code char} array argument.
//     * <p>
//     * The {@code offset} argument is the index of the first
//     * character of the subarray. The {@code count} argument
//     * specifies the length of the subarray. The contents of the subarray
//     * are copied; subsequent modification of the character array does not
//     * affect the returned string.
//     *
//     * @param   data     the character array.
//     * @param   offset   initial offset of the subarray.
//     * @param   count    length of the subarray.
//     * @return  a {@code String} that contains the characters of the
//     *          specified subarray of the character array.
//     * @throws    IndexOutOfBoundsException if {@code offset} is
//     *          negative, or {@code count} is negative, or
//     *          {@code offset+count} is larger than
//     *          {@code data.length}.
//     */
//    public static java.lang.String valueOf(char data[], int offset, int count) {
//        return new java.lang.String(data, offset, count);
//    }
//
//    /**
//     * Equivalent to {@link #valueOf(char[], int, int)}.
//     *
//     * @param   data     the character array.
//     * @param   offset   initial offset of the subarray.
//     * @param   count    length of the subarray.
//     * @return  a {@code String} that contains the characters of the
//     *          specified subarray of the character array.
//     * @throws    IndexOutOfBoundsException if {@code offset} is
//     *          negative, or {@code count} is negative, or
//     *          {@code offset+count} is larger than
//     *          {@code data.length}.
//     */
//    public static java.lang.String copyValueOf(char data[], int offset, int count) {
//        return new java.lang.String(data, offset, count);
//    }
//
//    /**
//     * Equivalent to {@link #valueOf(char[])}.
//     *
//     * @param   data   the character array.
//     * @return  a {@code String} that contains the characters of the
//     *          character array.
//     */
//    public static java.lang.String copyValueOf(char data[]) {
//        return new java.lang.String(data);
//    }
//
//    /**
//     * Returns the string representation of the {@code boolean} argument.
//     *
//     * @param   b   a {@code boolean}.
//     * @return  if the argument is {@code true}, a string equal to
//     *          {@code "true"} is returned; otherwise, a string equal to
//     *          {@code "false"} is returned.
//     */
//    public static java.lang.String valueOf(boolean b) {
//        return b ? "true" : "false";
//    }
//
//    /**
//     * Returns the string representation of the {@code char}
//     * argument.
//     *
//     * @param   c   a {@code char}.
//     * @return  a string of length {@code 1} containing
//     *          as its single character the argument {@code c}.
//     */
//    public static java.lang.String valueOf(char c) {
//        if (COMPACT_STRINGS && StringLatin1.canEncode(c)) {
//            return new java.lang.String(StringLatin1.toBytes(c), LATIN1);
//        }
//        return new java.lang.String(StringUTF16.toBytes(c), UTF16);
//    }
//
//    /**
//     * Returns the string representation of the {@code int} argument.
//     * <p>
//     * The representation is exactly the one returned by the
//     * {@code Integer.toString} method of one argument.
//     *
//     * @param   i   an {@code int}.
//     * @return  a string representation of the {@code int} argument.
//     * @see     java.lang.Integer#toString(int, int)
//     */
//    public static java.lang.String valueOf(int i) {
//        return Integer.toString(i);
//    }
//
//    /**
//     * Returns the string representation of the {@code long} argument.
//     * <p>
//     * The representation is exactly the one returned by the
//     * {@code Long.toString} method of one argument.
//     *
//     * @param   l   a {@code long}.
//     * @return  a string representation of the {@code long} argument.
//     * @see     java.lang.Long#toString(long)
//     */
//    public static java.lang.String valueOf(long l) {
//        return Long.toString(l);
//    }
//
//    /**
//     * Returns the string representation of the {@code float} argument.
//     * <p>
//     * The representation is exactly the one returned by the
//     * {@code Float.toString} method of one argument.
//     *
//     * @param   f   a {@code float}.
//     * @return  a string representation of the {@code float} argument.
//     * @see     java.lang.Float#toString(float)
//     */
//    public static java.lang.String valueOf(float f) {
//        return Float.toString(f);
//    }
//
//    /**
//     * Returns the string representation of the {@code double} argument.
//     * <p>
//     * The representation is exactly the one returned by the
//     * {@code Double.toString} method of one argument.
//     *
//     * @param   d   a {@code double}.
//     * @return  a  string representation of the {@code double} argument.
//     * @see     java.lang.Double#toString(double)
//     */
//    public static java.lang.String valueOf(double d) {
//        return Double.toString(d);
//    }
//
//    /**
//     * Returns a canonical representation for the string object.
//     * <p>
//     * A pool of strings, initially empty, is maintained privately by the
//     * class {@code String}.
//     * <p>
//     * When the intern method is invoked, if the pool already contains a
//     * string equal to this {@code String} object as determined by
//     * the {@link #equals(Object)} method, then the string from the pool is
//     * returned. Otherwise, this {@code String} object is added to the
//     * pool and a reference to this {@code String} object is returned.
//     * <p>
//     * It follows that for any two strings {@code s} and {@code t},
//     * {@code s.intern() == t.intern()} is {@code true}
//     * if and only if {@code s.equals(t)} is {@code true}.
//     * <p>
//     * All literal strings and string-valued constant expressions are
//     * interned. String literals are defined in section {@jls 3.10.5} of the
//     * <cite>The Java Language Specification</cite>.
//     *
//     * @return  a string that has the same contents as this string, but is
//     *          guaranteed to be from a pool of unique strings.
//     */
//    public native java.lang.String intern();
//
//    /**
//     * Returns a string whose value is the concatenation of this
//     * string repeated {@code count} times.
//     * <p>
//     * If this string is empty or count is zero then the empty
//     * string is returned.
//     *
//     * @param   count number of times to repeat
//     *
//     * @return  A string composed of this string repeated
//     *          {@code count} times or the empty string if this
//     *          string is empty or count is zero
//     *
//     * @throws  IllegalArgumentException if the {@code count} is
//     *          negative.
//     *
//     * @since 11
//     */
//    public java.lang.String repeat(int count) {
//        if (count < 0) {
//            throw new IllegalArgumentException("count is negative: " + count);
//        }
//        if (count == 1) {
//            return this;
//        }
//        final int len = value.length;
//        if (len == 0 || count == 0) {
//            return "";
//        }
//        if (Integer.MAX_VALUE / count < len) {
//            throw new OutOfMemoryError("Required length exceeds implementation limit");
//        }
//        if (len == 1) {
//            final byte[] single = new byte[count];
//            Arrays.fill(single, value[0]);
//            return new java.lang.String(single, coder);
//        }
//        final int limit = len * count;
//        final byte[] multiple = new byte[limit];
//        System.arraycopy(value, 0, multiple, 0, len);
//        int copied = len;
//        for (; copied < limit - copied; copied <<= 1) {
//            System.arraycopy(multiple, 0, multiple, copied, copied);
//        }
//        System.arraycopy(multiple, 0, multiple, copied, limit - copied);
//        return new java.lang.String(multiple, coder);
//    }
//
//    ////////////////////////////////////////////////////////////////
//
//    /**
//     * Copy character bytes from this string into dst starting at dstBegin.
//     * This method doesn't perform any range checking.
//     *
//     * Invoker guarantees: dst is in UTF16 (inflate itself for asb), if two
//     * coders are different, and dst is big enough (range check)
//     *
//     * @param dstBegin  the char index, not offset of byte[]
//     * @param coder     the coder of dst[]
//     */
//    void getBytes(byte[] dst, int dstBegin, byte coder) {
//        if (coder() == coder) {
//            System.arraycopy(value, 0, dst, dstBegin << coder, value.length);
//        } else {    // this.coder == LATIN && coder == UTF16
//            StringLatin1.inflate(value, 0, dst, dstBegin, value.length);
//        }
//    }
//
//    /**
//     * Copy character bytes from this string into dst starting at dstBegin.
//     * This method doesn't perform any range checking.
//     *
//     * Invoker guarantees: dst is in UTF16 (inflate itself for asb), if two
//     * coders are different, and dst is big enough (range check)
//     *
//     * @param srcPos    the char index, not offset of byte[]
//     * @param dstBegin  the char index to start from
//     * @param coder     the coder of dst[]
//     * @param length    the amount of copied chars
//     */
//    void getBytes(byte[] dst, int srcPos, int dstBegin, byte coder, int length) {
//        if (coder() == coder) {
//            System.arraycopy(value, srcPos << coder, dst, dstBegin << coder, length << coder);
//        } else {    // this.coder == LATIN && coder == UTF16
//            StringLatin1.inflate(value, srcPos, dst, dstBegin, length);
//        }
//    }
//
//    /*
//     * Package private constructor. Trailing Void argument is there for
//     * disambiguating it against other (public) constructors.
//     *
//     * Stores the char[] value into a byte[] that each byte represents
//     * the8 low-order bits of the corresponding character, if the char[]
//     * contains only latin1 character. Or a byte[] that stores all
//     * characters in their byte sequences defined by the {@code StringUTF16}.
//     */
//    String(char[] value, int off, int len, Void sig) {
//        if (len == 0) {
//            this.value = "".value;
//            this.coder = "".coder;
//            return;
//        }
//        if (COMPACT_STRINGS) {
//            byte[] val = StringUTF16.compress(value, off, len);
//            if (val != null) {
//                this.value = val;
//                this.coder = LATIN1;
//                return;
//            }
//        }
//        this.coder = UTF16;
//        this.value = StringUTF16.toBytes(value, off, len);
//    }
//
//    /*
//     * Package private constructor. Trailing Void argument is there for
//     * disambiguating it against other (public) constructors.
//     */
//    String(AbstractStringBuilder asb, Void sig) {
//        byte[] val = asb.getValue();
//        int length = asb.length();
//        if (asb.isLatin1()) {
//            this.coder = LATIN1;
//            this.value = Arrays.copyOfRange(val, 0, length);
//        } else {
//            if (COMPACT_STRINGS) {
//                byte[] buf = StringUTF16.compress(val, 0, length);
//                if (buf != null) {
//                    this.coder = LATIN1;
//                    this.value = buf;
//                    return;
//                }
//            }
//            this.coder = UTF16;
//            this.value = Arrays.copyOfRange(val, 0, length << 1);
//        }
//    }
//
//    /*
//     * Package private constructor which shares value array for speed.
//     */
//    String(byte[] value, byte coder) {
//        this.value = value;
//        this.coder = coder;
//    }
//
//    byte coder() {
//        return COMPACT_STRINGS ? coder : UTF16;
//    }
//
//    byte[] value() {
//        return value;
//    }
//
//    boolean isLatin1() {
//        return COMPACT_STRINGS && coder == LATIN1;
//    }
//
//    @Native
//    static final byte LATIN1 = 0;
//    @Native static final byte UTF16  = 1;
//
//    /*
//     * StringIndexOutOfBoundsException  if {@code index} is
//     * negative or greater than or equal to {@code length}.
//     */
//    static void checkIndex(int index, int length) {
//        if (index < 0 || index >= length) {
//            throw new StringIndexOutOfBoundsException("index " + index +
//                    ", length " + length);
//        }
//    }
//
//    /*
//     * StringIndexOutOfBoundsException  if {@code offset}
//     * is negative or greater than {@code length}.
//     */
//    static void checkOffset(int offset, int length) {
//        if (offset < 0 || offset > length) {
//            throw new StringIndexOutOfBoundsException("offset " + offset +
//                    ", length " + length);
//        }
//    }
//
//    /*
//     * Check {@code offset}, {@code count} against {@code 0} and {@code length}
//     * bounds.
//     *
//     * @throws  StringIndexOutOfBoundsException
//     *          If {@code offset} is negative, {@code count} is negative,
//     *          or {@code offset} is greater than {@code length - count}
//     */
//    static void checkBoundsOffCount(int offset, int count, int length) {
//        if (offset < 0 || count < 0 || offset > length - count) {
//            throw new StringIndexOutOfBoundsException(
//                    "offset " + offset + ", count " + count + ", length " + length);
//        }
//    }
//
//    /*
//     * Check {@code begin}, {@code end} against {@code 0} and {@code length}
//     * bounds.
//     *
//     * @throws  StringIndexOutOfBoundsException
//     *          If {@code begin} is negative, {@code begin} is greater than
//     *          {@code end}, or {@code end} is greater than {@code length}.
//     */
//    static void checkBoundsBeginEnd(int begin, int end, int length) {
//        if (begin < 0 || begin > end || end > length) {
//            throw new StringIndexOutOfBoundsException(
//                    "begin " + begin + ", end " + end + ", length " + length);
//        }
//    }
//
//    /**
//     * Returns the string representation of the {@code codePoint}
//     * argument.
//     *
//     * @param   codePoint a {@code codePoint}.
//     * @return  a string of length {@code 1} or {@code 2} containing
//     *          as its single character the argument {@code codePoint}.
//     * @throws IllegalArgumentException if the specified
//     *          {@code codePoint} is not a {@linkplain Character#isValidCodePoint
//     *          valid Unicode code point}.
//     */
//    static java.lang.String valueOfCodePoint(int codePoint) {
//        if (COMPACT_STRINGS && StringLatin1.canEncode(codePoint)) {
//            return new java.lang.String(StringLatin1.toBytes((char)codePoint), LATIN1);
//        } else if (Character.isBmpCodePoint(codePoint)) {
//            return new java.lang.String(StringUTF16.toBytes((char)codePoint), UTF16);
//        } else if (Character.isSupplementaryCodePoint(codePoint)) {
//            return new java.lang.String(StringUTF16.toBytesSupplementary(codePoint), UTF16);
//        }
//
//        throw new IllegalArgumentException(
//                format("Not a valid Unicode code point: 0x%X", codePoint));
//    }
//
//    /**
//     * Returns an {@link Optional} containing the nominal descriptor for this
//     * instance, which is the instance itself.
//     *
//     * @return an {@link Optional} describing the {@linkplain java.lang.String} instance
//     * @since 12
//     */
//    @Override
//    public Optional<java.lang.String> describeConstable() {
//        return Optional.of(this);
//    }
//
//    /**
//     * Resolves this instance as a {@link ConstantDesc}, the result of which is
//     * the instance itself.
//     *
//     * @param lookup ignored
//     * @return the {@linkplain java.lang.String} instance
//     * @since 12
//     */
//    @Override
//    public java.lang.String resolveConstantDesc(MethodHandles.Lookup lookup) {
//        return this;
//    }
//
//}


///*
// * Copyright (c) 1997, 2019, Oracle and/or its affiliates. All rights reserved.
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
// *
// * This code is free software; you can redistribute it and/or modify it
// * under the terms of the GNU General Public License version 2 only, as
// * published by the Free Software Foundation.  Oracle designates this
// * particular file as subject to the "Classpath" exception as provided
// * by Oracle in the LICENSE file that accompanied this code.
// *
// * This code is distributed in the hope that it will be useful, but WITHOUT
// * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// * version 2 for more details (a copy is included in the LICENSE file that
// * accompanied this code).
// *
// * You should have received a copy of the GNU General Public License version
// * 2 along with this work; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
// *
// * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// * or visit www.oracle.com if you need additional information or have any
// * questions.
// */
//
//package java.util;
//
//        import java.util.function.Consumer;
//        import java.util.function.Predicate;
//        import java.util.function.UnaryOperator;
//        import jdk.internal.access.SharedSecrets;
//        import jdk.internal.util.ArraysSupport;
//
///**
// * Resizable-array implementation of the {@code List} interface.  Implements
// * all optional list operations, and permits all elements, including
// * {@code null}.  In addition to implementing the {@code List} interface,
// * this class provides methods to manipulate the size of the array that is
// * used internally to store the list.  (This class is roughly equivalent to
// * {@code Vector}, except that it is unsynchronized.)
// *
// * <p>The {@code size}, {@code isEmpty}, {@code get}, {@code set},
// * {@code iterator}, and {@code listIterator} operations run in constant
// * time.  The {@code add} operation runs in <i>amortized constant time</i>,
// * that is, adding n elements requires O(n) time.  All of the other operations
// * run in linear time (roughly speaking).  The constant factor is low compared
// * to that for the {@code LinkedList} implementation.
// *
// * <p>Each {@code ArrayList} instance has a <i>capacity</i>.  The capacity is
// * the size of the array used to store the elements in the list.  It is always
// * at least as large as the list size.  As elements are added to an ArrayList,
// * its capacity grows automatically.  The details of the growth policy are not
// * specified beyond the fact that adding an element has constant amortized
// * time cost.
// *
// * <p>An application can increase the capacity of an {@code ArrayList} instance
// * before adding a large number of elements using the {@code ensureCapacity}
// * operation.  This may reduce the amount of incremental reallocation.
// *
// * <p><strong>Note that this implementation is not synchronized.</strong>
// * If multiple threads access an {@code ArrayList} instance concurrently,
// * and at least one of the threads modifies the list structurally, it
// * <i>must</i> be synchronized externally.  (A structural modification is
// * any operation that adds or deletes one or more elements, or explicitly
// * resizes the backing array; merely setting the value of an element is not
// * a structural modification.)  This is typically accomplished by
// * synchronizing on some object that naturally encapsulates the list.
// *
// * If no such object exists, the list should be "wrapped" using the
// * {@link Collections#synchronizedList Collections.synchronizedList}
// * method.  This is best done at creation time, to prevent accidental
// * unsynchronized access to the list:<pre>
// *   List list = Collections.synchronizedList(new ArrayList(...));</pre>
// *
// * <p id="fail-fast">
// * The iterators returned by this class's {@link #iterator() iterator} and
// * {@link #listIterator(int) listIterator} methods are <em>fail-fast</em>:
// * if the list is structurally modified at any time after the iterator is
// * created, in any way except through the iterator's own
// * {@link ListIterator#remove() remove} or
// * {@link ListIterator#add(Object) add} methods, the iterator will throw a
// * {@link ConcurrentModificationException}.  Thus, in the face of
// * concurrent modification, the iterator fails quickly and cleanly, rather
// * than risking arbitrary, non-deterministic behavior at an undetermined
// * time in the future.
// *
// * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
// * as it is, generally speaking, impossible to make any hard guarantees in the
// * presence of unsynchronized concurrent modification.  Fail-fast iterators
// * throw {@code ConcurrentModificationException} on a best-effort basis.
// * Therefore, it would be wrong to write a program that depended on this
// * exception for its correctness:  <i>the fail-fast behavior of iterators
// * should be used only to detect bugs.</i>
// *
// * <p>This class is a member of the
// * <a href="{@docRoot}/java.base/java/util/package-summary.html#CollectionsFramework">
// * Java Collections Framework</a>.
// *
// * @param <E> the type of elements in this list
// *
// * @author  Josh Bloch
// * @author  Neal Gafter
// * @see     Collection
// * @see     List
// * @see     LinkedList
// * @see     Vector
// * @since   1.2
// */
//public class ArrayList<E> extends AbstractList<E>
//        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
//{
//    @java.io.Serial
//    private static final long serialVersionUID = 8683452581122892189L;
//
//    /**
//     * Default initial capacity.
//     */
//    private static final int DEFAULT_CAPACITY = 10;
//
//    /**
//     * Shared empty array instance used for empty instances.
//     */
//    private static final Object[] EMPTY_ELEMENTDATA = {};
//
//    /**
//     * Shared empty array instance used for default sized empty instances. We
//     * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
//     * first element is added.
//     */
//    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
//
//    /**
//     * The array buffer into which the elements of the ArrayList are stored.
//     * The capacity of the ArrayList is the length of this array buffer. Any
//     * empty ArrayList with elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
//     * will be expanded to DEFAULT_CAPACITY when the first element is added.
//     */
//    transient Object[] elementData; // non-private to simplify nested class access
//
//    /**
//     * The size of the ArrayList (the number of elements it contains).
//     *
//     * @serial
//     */
//    private int size;
//
//    /**
//     * Constructs an empty list with the specified initial capacity.
//     *
//     * @param  initialCapacity  the initial capacity of the list
//     * @throws IllegalArgumentException if the specified initial capacity
//     *         is negative
//     */
//    public ArrayList(int initialCapacity) {
//        if (initialCapacity > 0) {
//            this.elementData = new Object[initialCapacity];
//        } else if (initialCapacity == 0) {
//            this.elementData = EMPTY_ELEMENTDATA;
//        } else {
//            throw new IllegalArgumentException("Illegal Capacity: "+
//                    initialCapacity);
//        }
//    }
//
//    /**
//     * Constructs an empty list with an initial capacity of ten.
//     */
//    public ArrayList() {
//        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
//    }
//
//    /**
//     * Constructs a list containing the elements of the specified
//     * collection, in the order they are returned by the collection's
//     * iterator.
//     *
//     * @param c the collection whose elements are to be placed into this list
//     * @throws NullPointerException if the specified collection is null
//     */
//    public ArrayList(Collection<? extends E> c) {
//        Object[] a = c.toArray();
//        if ((size = a.length) != 0) {
//            if (c.getClass() == java.util.ArrayList.class) {
//                elementData = a;
//            } else {
//                elementData = Arrays.copyOf(a, size, Object[].class);
//            }
//        } else {
//            // replace with empty array.
//            elementData = EMPTY_ELEMENTDATA;
//        }
//    }
//
//    /**
//     * Trims the capacity of this {@code ArrayList} instance to be the
//     * list's current size.  An application can use this operation to minimize
//     * the storage of an {@code ArrayList} instance.
//     */
//    public void trimToSize() {
//        modCount++;
//        if (size < elementData.length) {
//            elementData = (size == 0)
//                    ? EMPTY_ELEMENTDATA
//                    : Arrays.copyOf(elementData, size);
//        }
//    }
//
//    /**
//     * Increases the capacity of this {@code ArrayList} instance, if
//     * necessary, to ensure that it can hold at least the number of elements
//     * specified by the minimum capacity argument.
//     *
//     * @param minCapacity the desired minimum capacity
//     */
//    public void ensureCapacity(int minCapacity) {
//        if (minCapacity > elementData.length
//                && !(elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA
//                && minCapacity <= DEFAULT_CAPACITY)) {
//            modCount++;
//            grow(minCapacity);
//        }
//    }
//
//    /**
//     * Increases the capacity to ensure that it can hold at least the
//     * number of elements specified by the minimum capacity argument.
//     *
//     * @param minCapacity the desired minimum capacity
//     * @throws OutOfMemoryError if minCapacity is less than zero
//     */
//    private Object[] grow(int minCapacity) {
//        int oldCapacity = elementData.length;
//        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
//            int newCapacity = ArraysSupport.newLength(oldCapacity,
//                    minCapacity - oldCapacity, /* minimum growth */
//                    oldCapacity >> 1           /* preferred growth */);
//            return elementData = Arrays.copyOf(elementData, newCapacity);
//        } else {
//            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
//        }
//    }
//
//    private Object[] grow() {
//        return grow(size + 1);
//    }
//
//    /**
//     * Returns the number of elements in this list.
//     *
//     * @return the number of elements in this list
//     */
//    public int size() {
//        return size;
//    }
//
//    /**
//     * Returns {@code true} if this list contains no elements.
//     *
//     * @return {@code true} if this list contains no elements
//     */
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    /**
//     * Returns {@code true} if this list contains the specified element.
//     * More formally, returns {@code true} if and only if this list contains
//     * at least one element {@code e} such that
//     * {@code Objects.equals(o, e)}.
//     *
//     * @param o element whose presence in this list is to be tested
//     * @return {@code true} if this list contains the specified element
//     */
//    public boolean contains(Object o) {
//        return indexOf(o) >= 0;
//    }
//
//    /**
//     * Returns the index of the first occurrence of the specified element
//     * in this list, or -1 if this list does not contain the element.
//     * More formally, returns the lowest index {@code i} such that
//     * {@code Objects.equals(o, get(i))},
//     * or -1 if there is no such index.
//     */
//    public int indexOf(Object o) {
//        return indexOfRange(o, 0, size);
//    }
//
//    int indexOfRange(Object o, int start, int end) {
//        Object[] es = elementData;
//        if (o == null) {
//            for (int i = start; i < end; i++) {
//                if (es[i] == null) {
//                    return i;
//                }
//            }
//        } else {
//            for (int i = start; i < end; i++) {
//                if (o.equals(es[i])) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    /**
//     * Returns the index of the last occurrence of the specified element
//     * in this list, or -1 if this list does not contain the element.
//     * More formally, returns the highest index {@code i} such that
//     * {@code Objects.equals(o, get(i))},
//     * or -1 if there is no such index.
//     */
//    public int lastIndexOf(Object o) {
//        return lastIndexOfRange(o, 0, size);
//    }
//
//    int lastIndexOfRange(Object o, int start, int end) {
//        Object[] es = elementData;
//        if (o == null) {
//            for (int i = end - 1; i >= start; i--) {
//                if (es[i] == null) {
//                    return i;
//                }
//            }
//        } else {
//            for (int i = end - 1; i >= start; i--) {
//                if (o.equals(es[i])) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    /**
//     * Returns a shallow copy of this {@code ArrayList} instance.  (The
//     * elements themselves are not copied.)
//     *
//     * @return a clone of this {@code ArrayList} instance
//     */
//    public Object clone() {
//        try {
//            java.util.ArrayList<?> v = (java.util.ArrayList<?>) super.clone();
//            v.elementData = Arrays.copyOf(elementData, size);
//            v.modCount = 0;
//            return v;
//        } catch (CloneNotSupportedException e) {
//            // this shouldn't happen, since we are Cloneable
//            throw new InternalError(e);
//        }
//    }
//
//    /**
//     * Returns an array containing all of the elements in this list
//     * in proper sequence (from first to last element).
//     *
//     * <p>The returned array will be "safe" in that no references to it are
//     * maintained by this list.  (In other words, this method must allocate
//     * a new array).  The caller is thus free to modify the returned array.
//     *
//     * <p>This method acts as bridge between array-based and collection-based
//     * APIs.
//     *
//     * @return an array containing all of the elements in this list in
//     *         proper sequence
//     */
//    public Object[] toArray() {
//        return Arrays.copyOf(elementData, size);
//    }
//
//    /**
//     * Returns an array containing all of the elements in this list in proper
//     * sequence (from first to last element); the runtime type of the returned
//     * array is that of the specified array.  If the list fits in the
//     * specified array, it is returned therein.  Otherwise, a new array is
//     * allocated with the runtime type of the specified array and the size of
//     * this list.
//     *
//     * <p>If the list fits in the specified array with room to spare
//     * (i.e., the array has more elements than the list), the element in
//     * the array immediately following the end of the collection is set to
//     * {@code null}.  (This is useful in determining the length of the
//     * list <i>only</i> if the caller knows that the list does not contain
//     * any null elements.)
//     *
//     * @param a the array into which the elements of the list are to
//     *          be stored, if it is big enough; otherwise, a new array of the
//     *          same runtime type is allocated for this purpose.
//     * @return an array containing the elements of the list
//     * @throws ArrayStoreException if the runtime type of the specified array
//     *         is not a supertype of the runtime type of every element in
//     *         this list
//     * @throws NullPointerException if the specified array is null
//     */
//    @SuppressWarnings("unchecked")
//    public <T> T[] toArray(T[] a) {
//        if (a.length < size)
//            // Make a new array of a's runtime type, but my contents:
//            return (T[]) Arrays.copyOf(elementData, size, a.getClass());
//        System.arraycopy(elementData, 0, a, 0, size);
//        if (a.length > size)
//            a[size] = null;
//        return a;
//    }
//
//    // Positional Access Operations
//
//    @SuppressWarnings("unchecked")
//    E elementData(int index) {
//        return (E) elementData[index];
//    }
//
//    @SuppressWarnings("unchecked")
//    static <E> E elementAt(Object[] es, int index) {
//        return (E) es[index];
//    }
//
//    /**
//     * Returns the element at the specified position in this list.
//     *
//     * @param  index index of the element to return
//     * @return the element at the specified position in this list
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public E get(int index) {
//        Objects.checkIndex(index, size);
//        return elementData(index);
//    }
//
//    /**
//     * Replaces the element at the specified position in this list with
//     * the specified element.
//     *
//     * @param index index of the element to replace
//     * @param element element to be stored at the specified position
//     * @return the element previously at the specified position
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public E set(int index, E element) {
//        Objects.checkIndex(index, size);
//        E oldValue = elementData(index);
//        elementData[index] = element;
//        return oldValue;
//    }
//
//    /**
//     * This helper method split out from add(E) to keep method
//     * bytecode size under 35 (the -XX:MaxInlineSize default value),
//     * which helps when add(E) is called in a C1-compiled loop.
//     */
//    private void add(E e, Object[] elementData, int s) {
//        if (s == elementData.length)
//            elementData = grow();
//        elementData[s] = e;
//        size = s + 1;
//    }
//
//    /**
//     * Appends the specified element to the end of this list.
//     *
//     * @param e element to be appended to this list
//     * @return {@code true} (as specified by {@link Collection#add})
//     */
//    public boolean add(E e) {
//        modCount++;
//        add(e, elementData, size);
//        return true;
//    }
//
//    /**
//     * Inserts the specified element at the specified position in this
//     * list. Shifts the element currently at that position (if any) and
//     * any subsequent elements to the right (adds one to their indices).
//     *
//     * @param index index at which the specified element is to be inserted
//     * @param element element to be inserted
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public void add(int index, E element) {
//        rangeCheckForAdd(index);
//        modCount++;
//        final int s;
//        Object[] elementData;
//        if ((s = size) == (elementData = this.elementData).length)
//            elementData = grow();
//        System.arraycopy(elementData, index,
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;
//        size = s + 1;
//    }
//
//    /**
//     * Removes the element at the specified position in this list.
//     * Shifts any subsequent elements to the left (subtracts one from their
//     * indices).
//     *
//     * @param index the index of the element to be removed
//     * @return the element that was removed from the list
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public E remove(int index) {
//        Objects.checkIndex(index, size);
//        final Object[] es = elementData;
//
//        @SuppressWarnings("unchecked") E oldValue = (E) es[index];
//        fastRemove(es, index);
//
//        return oldValue;
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public boolean equals(Object o) {
//        if (o == this) {
//            return true;
//        }
//
//        if (!(o instanceof List)) {
//            return false;
//        }
//
//        final int expectedModCount = modCount;
//        // ArrayList can be subclassed and given arbitrary behavior, but we can
//        // still deal with the common case where o is ArrayList precisely
//        boolean equal = (o.getClass() == java.util.ArrayList.class)
//                ? equalsArrayList((java.util.ArrayList<?>) o)
//                : equalsRange((List<?>) o, 0, size);
//
//        checkForComodification(expectedModCount);
//        return equal;
//    }
//
//    boolean equalsRange(List<?> other, int from, int to) {
//        final Object[] es = elementData;
//        if (to > es.length) {
//            throw new ConcurrentModificationException();
//        }
//        var oit = other.iterator();
//        for (; from < to; from++) {
//            if (!oit.hasNext() || !Objects.equals(es[from], oit.next())) {
//                return false;
//            }
//        }
//        return !oit.hasNext();
//    }
//
//    private boolean equalsArrayList(java.util.ArrayList<?> other) {
//        final int otherModCount = other.modCount;
//        final int s = size;
//        boolean equal;
//        if (equal = (s == other.size)) {
//            final Object[] otherEs = other.elementData;
//            final Object[] es = elementData;
//            if (s > es.length || s > otherEs.length) {
//                throw new ConcurrentModificationException();
//            }
//            for (int i = 0; i < s; i++) {
//                if (!Objects.equals(es[i], otherEs[i])) {
//                    equal = false;
//                    break;
//                }
//            }
//        }
//        other.checkForComodification(otherModCount);
//        return equal;
//    }
//
//    private void checkForComodification(final int expectedModCount) {
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     */
//    public int hashCode() {
//        int expectedModCount = modCount;
//        int hash = hashCodeRange(0, size);
//        checkForComodification(expectedModCount);
//        return hash;
//    }
//
//    int hashCodeRange(int from, int to) {
//        final Object[] es = elementData;
//        if (to > es.length) {
//            throw new ConcurrentModificationException();
//        }
//        int hashCode = 1;
//        for (int i = from; i < to; i++) {
//            Object e = es[i];
//            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
//        }
//        return hashCode;
//    }
//
//    /**
//     * Removes the first occurrence of the specified element from this list,
//     * if it is present.  If the list does not contain the element, it is
//     * unchanged.  More formally, removes the element with the lowest index
//     * {@code i} such that
//     * {@code Objects.equals(o, get(i))}
//     * (if such an element exists).  Returns {@code true} if this list
//     * contained the specified element (or equivalently, if this list
//     * changed as a result of the call).
//     *
//     * @param o element to be removed from this list, if present
//     * @return {@code true} if this list contained the specified element
//     */
//    public boolean remove(Object o) {
//        final Object[] es = elementData;
//        final int size = this.size;
//        int i = 0;
//        found: {
//            if (o == null) {
//                for (; i < size; i++)
//                    if (es[i] == null)
//                        break found;
//            } else {
//                for (; i < size; i++)
//                    if (o.equals(es[i]))
//                        break found;
//            }
//            return false;
//        }
//        fastRemove(es, i);
//        return true;
//    }
//
//    /**
//     * Private remove method that skips bounds checking and does not
//     * return the value removed.
//     */
//    private void fastRemove(Object[] es, int i) {
//        modCount++;
//        final int newSize;
//        if ((newSize = size - 1) > i)
//            System.arraycopy(es, i + 1, es, i, newSize - i);
//        es[size = newSize] = null;
//    }
//
//    /**
//     * Removes all of the elements from this list.  The list will
//     * be empty after this call returns.
//     */
//    public void clear() {
//        modCount++;
//        final Object[] es = elementData;
//        for (int to = size, i = size = 0; i < to; i++)
//            es[i] = null;
//    }
//
//    /**
//     * Appends all of the elements in the specified collection to the end of
//     * this list, in the order that they are returned by the
//     * specified collection's Iterator.  The behavior of this operation is
//     * undefined if the specified collection is modified while the operation
//     * is in progress.  (This implies that the behavior of this call is
//     * undefined if the specified collection is this list, and this
//     * list is nonempty.)
//     *
//     * @param c collection containing elements to be added to this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws NullPointerException if the specified collection is null
//     */
//    public boolean addAll(Collection<? extends E> c) {
//        Object[] a = c.toArray();
//        modCount++;
//        int numNew = a.length;
//        if (numNew == 0)
//            return false;
//        Object[] elementData;
//        final int s;
//        if (numNew > (elementData = this.elementData).length - (s = size))
//            elementData = grow(s + numNew);
//        System.arraycopy(a, 0, elementData, s, numNew);
//        size = s + numNew;
//        return true;
//    }
//
//    /**
//     * Inserts all of the elements in the specified collection into this
//     * list, starting at the specified position.  Shifts the element
//     * currently at that position (if any) and any subsequent elements to
//     * the right (increases their indices).  The new elements will appear
//     * in the list in the order that they are returned by the
//     * specified collection's iterator.
//     *
//     * @param index index at which to insert the first element from the
//     *              specified collection
//     * @param c collection containing elements to be added to this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     * @throws NullPointerException if the specified collection is null
//     */
//    public boolean addAll(int index, Collection<? extends E> c) {
//        rangeCheckForAdd(index);
//
//        Object[] a = c.toArray();
//        modCount++;
//        int numNew = a.length;
//        if (numNew == 0)
//            return false;
//        Object[] elementData;
//        final int s;
//        if (numNew > (elementData = this.elementData).length - (s = size))
//            elementData = grow(s + numNew);
//
//        int numMoved = s - index;
//        if (numMoved > 0)
//            System.arraycopy(elementData, index,
//                    elementData, index + numNew,
//                    numMoved);
//        System.arraycopy(a, 0, elementData, index, numNew);
//        size = s + numNew;
//        return true;
//    }
//
//    /**
//     * Removes from this list all of the elements whose index is between
//     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.
//     * Shifts any succeeding elements to the left (reduces their index).
//     * This call shortens the list by {@code (toIndex - fromIndex)} elements.
//     * (If {@code toIndex==fromIndex}, this operation has no effect.)
//     *
//     * @throws IndexOutOfBoundsException if {@code fromIndex} or
//     *         {@code toIndex} is out of range
//     *         ({@code fromIndex < 0 ||
//     *          toIndex > size() ||
//     *          toIndex < fromIndex})
//     */
//    protected void removeRange(int fromIndex, int toIndex) {
//        if (fromIndex > toIndex) {
//            throw new IndexOutOfBoundsException(
//                    outOfBoundsMsg(fromIndex, toIndex));
//        }
//        modCount++;
//        shiftTailOverGap(elementData, fromIndex, toIndex);
//    }
//
//    /** Erases the gap from lo to hi, by sliding down following elements. */
//    private void shiftTailOverGap(Object[] es, int lo, int hi) {
//        System.arraycopy(es, hi, es, lo, size - hi);
//        for (int to = size, i = (size -= hi - lo); i < to; i++)
//            es[i] = null;
//    }
//
//    /**
//     * A version of rangeCheck used by add and addAll.
//     */
//    private void rangeCheckForAdd(int index) {
//        if (index > size || index < 0)
//            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//    }
//
//    /**
//     * Constructs an IndexOutOfBoundsException detail message.
//     * Of the many possible refactorings of the error handling code,
//     * this "outlining" performs best with both server and client VMs.
//     */
//    private String outOfBoundsMsg(int index) {
//        return "Index: "+index+", Size: "+size;
//    }
//
//    /**
//     * A version used in checking (fromIndex > toIndex) condition
//     */
//    private static String outOfBoundsMsg(int fromIndex, int toIndex) {
//        return "From Index: " + fromIndex + " > To Index: " + toIndex;
//    }
//
//    /**
//     * Removes from this list all of its elements that are contained in the
//     * specified collection.
//     *
//     * @param c collection containing elements to be removed from this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws ClassCastException if the class of an element of this list
//     *         is incompatible with the specified collection
//     * (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if this list contains a null element and the
//     *         specified collection does not permit null elements
//     * (<a href="Collection.html#optional-restrictions">optional</a>),
//     *         or if the specified collection is null
//     * @see Collection#contains(Object)
//     */
//    public boolean removeAll(Collection<?> c) {
//        return batchRemove(c, false, 0, size);
//    }
//
//    /**
//     * Retains only the elements in this list that are contained in the
//     * specified collection.  In other words, removes from this list all
//     * of its elements that are not contained in the specified collection.
//     *
//     * @param c collection containing elements to be retained in this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws ClassCastException if the class of an element of this list
//     *         is incompatible with the specified collection
//     * (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if this list contains a null element and the
//     *         specified collection does not permit null elements
//     * (<a href="Collection.html#optional-restrictions">optional</a>),
//     *         or if the specified collection is null
//     * @see Collection#contains(Object)
//     */
//    public boolean retainAll(Collection<?> c) {
//        return batchRemove(c, true, 0, size);
//    }
//
//    boolean batchRemove(Collection<?> c, boolean complement,
//                        final int from, final int end) {
//        Objects.requireNonNull(c);
//        final Object[] es = elementData;
//        int r;
//        // Optimize for initial run of survivors
//        for (r = from;; r++) {
//            if (r == end)
//                return false;
//            if (c.contains(es[r]) != complement)
//                break;
//        }
//        int w = r++;
//        try {
//            for (Object e; r < end; r++)
//                if (c.contains(e = es[r]) == complement)
//                    es[w++] = e;
//        } catch (Throwable ex) {
//            // Preserve behavioral compatibility with AbstractCollection,
//            // even if c.contains() throws.
//            System.arraycopy(es, r, es, w, end - r);
//            w += end - r;
//            throw ex;
//        } finally {
//            modCount += end - w;
//            shiftTailOverGap(es, w, end);
//        }
//        return true;
//    }
//
//    /**
//     * Saves the state of the {@code ArrayList} instance to a stream
//     * (that is, serializes it).
//     *
//     * @param s the stream
//     * @throws java.io.IOException if an I/O error occurs
//     * @serialData The length of the array backing the {@code ArrayList}
//     *             instance is emitted (int), followed by all of its elements
//     *             (each an {@code Object}) in the proper order.
//     */
//    @java.io.Serial
//    private void writeObject(java.io.ObjectOutputStream s)
//            throws java.io.IOException {
//        // Write out element count, and any hidden stuff
//        int expectedModCount = modCount;
//        s.defaultWriteObject();
//
//        // Write out size as capacity for behavioral compatibility with clone()
//        s.writeInt(size);
//
//        // Write out all elements in the proper order.
//        for (int i=0; i<size; i++) {
//            s.writeObject(elementData[i]);
//        }
//
//        if (modCount != expectedModCount) {
//            throw new ConcurrentModificationException();
//        }
//    }
//
//    /**
//     * Reconstitutes the {@code ArrayList} instance from a stream (that is,
//     * deserializes it).
//     * @param s the stream
//     * @throws ClassNotFoundException if the class of a serialized object
//     *         could not be found
//     * @throws java.io.IOException if an I/O error occurs
//     */
//    @java.io.Serial
//    private void readObject(java.io.ObjectInputStream s)
//            throws java.io.IOException, ClassNotFoundException {
//
//        // Read in size, and any hidden stuff
//        s.defaultReadObject();
//
//        // Read in capacity
//        s.readInt(); // ignored
//
//        if (size > 0) {
//            // like clone(), allocate array based upon size not capacity
//            SharedSecrets.getJavaObjectInputStreamAccess().checkArray(s, Object[].class, size);
//            Object[] elements = new Object[size];
//
//            // Read in all elements in the proper order.
//            for (int i = 0; i < size; i++) {
//                elements[i] = s.readObject();
//            }
//
//            elementData = elements;
//        } else if (size == 0) {
//            elementData = EMPTY_ELEMENTDATA;
//        } else {
//            throw new java.io.InvalidObjectException("Invalid size: " + size);
//        }
//    }
//
//    /**
//     * Returns a list iterator over the elements in this list (in proper
//     * sequence), starting at the specified position in the list.
//     * The specified index indicates the first element that would be
//     * returned by an initial call to {@link ListIterator#next next}.
//     * An initial call to {@link ListIterator#previous previous} would
//     * return the element with the specified index minus one.
//     *
//     * <p>The returned list iterator is <a href="#fail-fast"><i>fail-fast</i></a>.
//     *
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public ListIterator<E> listIterator(int index) {
//        rangeCheckForAdd(index);
//        return new java.util.ArrayList.ListItr(index);
//    }
//
//    /**
//     * Returns a list iterator over the elements in this list (in proper
//     * sequence).
//     *
//     * <p>The returned list iterator is <a href="#fail-fast"><i>fail-fast</i></a>.
//     *
//     * @see #listIterator(int)
//     */
//    public ListIterator<E> listIterator() {
//        return new java.util.ArrayList.ListItr(0);
//    }
//
//    /**
//     * Returns an iterator over the elements in this list in proper sequence.
//     *
//     * <p>The returned iterator is <a href="#fail-fast"><i>fail-fast</i></a>.
//     *
//     * @return an iterator over the elements in this list in proper sequence
//     */
//    public Iterator<E> iterator() {
//        return new java.util.ArrayList.Itr();
//    }
//
//    /**
//     * An optimized version of AbstractList.Itr
//     */
//    private class Itr implements Iterator<E> {
//        int cursor;       // index of next element to return
//        int lastRet = -1; // index of last element returned; -1 if no such
//        int expectedModCount = modCount;
//
//        // prevent creating a synthetic constructor
//        Itr() {}
//
//        public boolean hasNext() {
//            return cursor != size;
//        }
//
//        @SuppressWarnings("unchecked")
//        public E next() {
//            checkForComodification();
//            int i = cursor;
//            if (i >= size)
//                throw new NoSuchElementException();
//            Object[] elementData = java.util.ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void remove() {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try {
//                java.util.ArrayList.this.remove(lastRet);
//                cursor = lastRet;
//                lastRet = -1;
//                expectedModCount = modCount;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//
//        @Override
//        public void forEachRemaining(Consumer<? super E> action) {
//            Objects.requireNonNull(action);
//            final int size = java.util.ArrayList.this.size;
//            int i = cursor;
//            if (i < size) {
//                final Object[] es = elementData;
//                if (i >= es.length)
//                    throw new ConcurrentModificationException();
//                for (; i < size && modCount == expectedModCount; i++)
//                    action.accept(elementAt(es, i));
//                // update once at end to reduce heap write traffic
//                cursor = i;
//                lastRet = i - 1;
//                checkForComodification();
//            }
//        }
//
//        final void checkForComodification() {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//        }
//    }
//
//    /**
//     * An optimized version of AbstractList.ListItr
//     */
//    private class ListItr extends java.util.ArrayList.Itr implements ListIterator<E> {
//        ListItr(int index) {
//            super();
//            cursor = index;
//        }
//
//        public boolean hasPrevious() {
//            return cursor != 0;
//        }
//
//        public int nextIndex() {
//            return cursor;
//        }
//
//        public int previousIndex() {
//            return cursor - 1;
//        }
//
//        @SuppressWarnings("unchecked")
//        public E previous() {
//            checkForComodification();
//            int i = cursor - 1;
//            if (i < 0)
//                throw new NoSuchElementException();
//            Object[] elementData = java.util.ArrayList.this.elementData;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i;
//            return (E) elementData[lastRet = i];
//        }
//
//        public void set(E e) {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//            checkForComodification();
//
//            try {
//                java.util.ArrayList.this.set(lastRet, e);
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//
//        public void add(E e) {
//            checkForComodification();
//
//            try {
//                int i = cursor;
//                java.util.ArrayList.this.add(i, e);
//                cursor = i + 1;
//                lastRet = -1;
//                expectedModCount = modCount;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }
//    }
//
//    /**
//     * Returns a view of the portion of this list between the specified
//     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.  (If
//     * {@code fromIndex} and {@code toIndex} are equal, the returned list is
//     * empty.)  The returned list is backed by this list, so non-structural
//     * changes in the returned list are reflected in this list, and vice-versa.
//     * The returned list supports all of the optional list operations.
//     *
//     * <p>This method eliminates the need for explicit range operations (of
//     * the sort that commonly exist for arrays).  Any operation that expects
//     * a list can be used as a range operation by passing a subList view
//     * instead of a whole list.  For example, the following idiom
//     * removes a range of elements from a list:
//     * <pre>
//     *      list.subList(from, to).clear();
//     * </pre>
//     * Similar idioms may be constructed for {@link #indexOf(Object)} and
//     * {@link #lastIndexOf(Object)}, and all of the algorithms in the
//     * {@link Collections} class can be applied to a subList.
//     *
//     * <p>The semantics of the list returned by this method become undefined if
//     * the backing list (i.e., this list) is <i>structurally modified</i> in
//     * any way other than via the returned list.  (Structural modifications are
//     * those that change the size of this list, or otherwise perturb it in such
//     * a fashion that iterations in progress may yield incorrect results.)
//     *
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     * @throws IllegalArgumentException {@inheritDoc}
//     */
//    public List<E> subList(int fromIndex, int toIndex) {
//        subListRangeCheck(fromIndex, toIndex, size);
//        return new java.util.ArrayList.SubList<>(this, fromIndex, toIndex);
//    }
//
//    private static class SubList<E> extends AbstractList<E> implements RandomAccess {
//        private final java.util.ArrayList<E> root;
//        private final java.util.ArrayList.SubList<E> parent;
//        private final int offset;
//        private int size;
//
//        /**
//         * Constructs a sublist of an arbitrary ArrayList.
//         */
//        public SubList(java.util.ArrayList<E> root, int fromIndex, int toIndex) {
//            this.root = root;
//            this.parent = null;
//            this.offset = fromIndex;
//            this.size = toIndex - fromIndex;
//            this.modCount = root.modCount;
//        }
//
//        /**
//         * Constructs a sublist of another SubList.
//         */
//        private SubList(java.util.ArrayList.SubList<E> parent, int fromIndex, int toIndex) {
//            this.root = parent.root;
//            this.parent = parent;
//            this.offset = parent.offset + fromIndex;
//            this.size = toIndex - fromIndex;
//            this.modCount = parent.modCount;
//        }
//
//        public E set(int index, E element) {
//            Objects.checkIndex(index, size);
//            checkForComodification();
//            E oldValue = root.elementData(offset + index);
//            root.elementData[offset + index] = element;
//            return oldValue;
//        }
//
//        public E get(int index) {
//            Objects.checkIndex(index, size);
//            checkForComodification();
//            return root.elementData(offset + index);
//        }
//
//        public int size() {
//            checkForComodification();
//            return size;
//        }
//
//        public void add(int index, E element) {
//            rangeCheckForAdd(index);
//            checkForComodification();
//            root.add(offset + index, element);
//            updateSizeAndModCount(1);
//        }
//
//        public E remove(int index) {
//            Objects.checkIndex(index, size);
//            checkForComodification();
//            E result = root.remove(offset + index);
//            updateSizeAndModCount(-1);
//            return result;
//        }
//
//        protected void removeRange(int fromIndex, int toIndex) {
//            checkForComodification();
//            root.removeRange(offset + fromIndex, offset + toIndex);
//            updateSizeAndModCount(fromIndex - toIndex);
//        }
//
//        public boolean addAll(Collection<? extends E> c) {
//            return addAll(this.size, c);
//        }
//
//        public boolean addAll(int index, Collection<? extends E> c) {
//            rangeCheckForAdd(index);
//            int cSize = c.size();
//            if (cSize==0)
//                return false;
//            checkForComodification();
//            root.addAll(offset + index, c);
//            updateSizeAndModCount(cSize);
//            return true;
//        }
//
//        public void replaceAll(UnaryOperator<E> operator) {
//            root.replaceAllRange(operator, offset, offset + size);
//        }
//
//        public boolean removeAll(Collection<?> c) {
//            return batchRemove(c, false);
//        }
//
//        public boolean retainAll(Collection<?> c) {
//            return batchRemove(c, true);
//        }
//
//        private boolean batchRemove(Collection<?> c, boolean complement) {
//            checkForComodification();
//            int oldSize = root.size;
//            boolean modified =
//                    root.batchRemove(c, complement, offset, offset + size);
//            if (modified)
//                updateSizeAndModCount(root.size - oldSize);
//            return modified;
//        }
//
//        public boolean removeIf(Predicate<? super E> filter) {
//            checkForComodification();
//            int oldSize = root.size;
//            boolean modified = root.removeIf(filter, offset, offset + size);
//            if (modified)
//                updateSizeAndModCount(root.size - oldSize);
//            return modified;
//        }
//
//        public Object[] toArray() {
//            checkForComodification();
//            return Arrays.copyOfRange(root.elementData, offset, offset + size);
//        }
//
//        @SuppressWarnings("unchecked")
//        public <T> T[] toArray(T[] a) {
//            checkForComodification();
//            if (a.length < size)
//                return (T[]) Arrays.copyOfRange(
//                        root.elementData, offset, offset + size, a.getClass());
//            System.arraycopy(root.elementData, offset, a, 0, size);
//            if (a.length > size)
//                a[size] = null;
//            return a;
//        }
//
//        public boolean equals(Object o) {
//            if (o == this) {
//                return true;
//            }
//
//            if (!(o instanceof List)) {
//                return false;
//            }
//
//            boolean equal = root.equalsRange((List<?>)o, offset, offset + size);
//            checkForComodification();
//            return equal;
//        }
//
//        public int hashCode() {
//            int hash = root.hashCodeRange(offset, offset + size);
//            checkForComodification();
//            return hash;
//        }
//
//        public int indexOf(Object o) {
//            int index = root.indexOfRange(o, offset, offset + size);
//            checkForComodification();
//            return index >= 0 ? index - offset : -1;
//        }
//
//        public int lastIndexOf(Object o) {
//            int index = root.lastIndexOfRange(o, offset, offset + size);
//            checkForComodification();
//            return index >= 0 ? index - offset : -1;
//        }
//
//        public boolean contains(Object o) {
//            return indexOf(o) >= 0;
//        }
//
//        public Iterator<E> iterator() {
//            return listIterator();
//        }
//
//        public ListIterator<E> listIterator(int index) {
//            checkForComodification();
//            rangeCheckForAdd(index);
//
//            return new ListIterator<E>() {
//                int cursor = index;
//                int lastRet = -1;
//                int expectedModCount = java.util.ArrayList.SubList.this.modCount;
//
//                public boolean hasNext() {
//                    return cursor != java.util.ArrayList.SubList.this.size;
//                }
//
//                @SuppressWarnings("unchecked")
//                public E next() {
//                    checkForComodification();
//                    int i = cursor;
//                    if (i >= java.util.ArrayList.SubList.this.size)
//                        throw new NoSuchElementException();
//                    Object[] elementData = root.elementData;
//                    if (offset + i >= elementData.length)
//                        throw new ConcurrentModificationException();
//                    cursor = i + 1;
//                    return (E) elementData[offset + (lastRet = i)];
//                }
//
//                public boolean hasPrevious() {
//                    return cursor != 0;
//                }
//
//                @SuppressWarnings("unchecked")
//                public E previous() {
//                    checkForComodification();
//                    int i = cursor - 1;
//                    if (i < 0)
//                        throw new NoSuchElementException();
//                    Object[] elementData = root.elementData;
//                    if (offset + i >= elementData.length)
//                        throw new ConcurrentModificationException();
//                    cursor = i;
//                    return (E) elementData[offset + (lastRet = i)];
//                }
//
//                public void forEachRemaining(Consumer<? super E> action) {
//                    Objects.requireNonNull(action);
//                    final int size = java.util.ArrayList.SubList.this.size;
//                    int i = cursor;
//                    if (i < size) {
//                        final Object[] es = root.elementData;
//                        if (offset + i >= es.length)
//                            throw new ConcurrentModificationException();
//                        for (; i < size && root.modCount == expectedModCount; i++)
//                            action.accept(elementAt(es, offset + i));
//                        // update once at end to reduce heap write traffic
//                        cursor = i;
//                        lastRet = i - 1;
//                        checkForComodification();
//                    }
//                }
//
//                public int nextIndex() {
//                    return cursor;
//                }
//
//                public int previousIndex() {
//                    return cursor - 1;
//                }
//
//                public void remove() {
//                    if (lastRet < 0)
//                        throw new IllegalStateException();
//                    checkForComodification();
//
//                    try {
//                        java.util.ArrayList.SubList.this.remove(lastRet);
//                        cursor = lastRet;
//                        lastRet = -1;
//                        expectedModCount = java.util.ArrayList.SubList.this.modCount;
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                public void set(E e) {
//                    if (lastRet < 0)
//                        throw new IllegalStateException();
//                    checkForComodification();
//
//                    try {
//                        root.set(offset + lastRet, e);
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                public void add(E e) {
//                    checkForComodification();
//
//                    try {
//                        int i = cursor;
//                        java.util.ArrayList.SubList.this.add(i, e);
//                        cursor = i + 1;
//                        lastRet = -1;
//                        expectedModCount = java.util.ArrayList.SubList.this.modCount;
//                    } catch (IndexOutOfBoundsException ex) {
//                        throw new ConcurrentModificationException();
//                    }
//                }
//
//                final void checkForComodification() {
//                    if (root.modCount != expectedModCount)
//                        throw new ConcurrentModificationException();
//                }
//            };
//        }
//
//        public List<E> subList(int fromIndex, int toIndex) {
//            subListRangeCheck(fromIndex, toIndex, size);
//            return new java.util.ArrayList.SubList<>(this, fromIndex, toIndex);
//        }
//
//        private void rangeCheckForAdd(int index) {
//            if (index < 0 || index > this.size)
//                throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
//        }
//
//        private String outOfBoundsMsg(int index) {
//            return "Index: "+index+", Size: "+this.size;
//        }
//
//        private void checkForComodification() {
//            if (root.modCount != modCount)
//                throw new ConcurrentModificationException();
//        }
//
//        private void updateSizeAndModCount(int sizeChange) {
//            java.util.ArrayList.SubList<E> slist = this;
//            do {
//                slist.size += sizeChange;
//                slist.modCount = root.modCount;
//                slist = slist.parent;
//            } while (slist != null);
//        }
//
//        public Spliterator<E> spliterator() {
//            checkForComodification();
//
//            // ArrayListSpliterator not used here due to late-binding
//            return new Spliterator<E>() {
//                private int index = offset; // current index, modified on advance/split
//                private int fence = -1; // -1 until used; then one past last index
//                private int expectedModCount; // initialized when fence set
//
//                private int getFence() { // initialize fence to size on first use
//                    int hi; // (a specialized variant appears in method forEach)
//                    if ((hi = fence) < 0) {
//                        expectedModCount = modCount;
//                        hi = fence = offset + size;
//                    }
//                    return hi;
//                }
//
//                public java.util.ArrayList<E>.ArrayListSpliterator trySplit() {
//                    int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
//                    // ArrayListSpliterator can be used here as the source is already bound
//                    return (lo >= mid) ? null : // divide range in half unless too small
//                            root.new ArrayListSpliterator(lo, index = mid, expectedModCount);
//                }
//
//                public boolean tryAdvance(Consumer<? super E> action) {
//                    Objects.requireNonNull(action);
//                    int hi = getFence(), i = index;
//                    if (i < hi) {
//                        index = i + 1;
//                        @SuppressWarnings("unchecked") E e = (E)root.elementData[i];
//                        action.accept(e);
//                        if (root.modCount != expectedModCount)
//                            throw new ConcurrentModificationException();
//                        return true;
//                    }
//                    return false;
//                }
//
//                public void forEachRemaining(Consumer<? super E> action) {
//                    Objects.requireNonNull(action);
//                    int i, hi, mc; // hoist accesses and checks from loop
//                    java.util.ArrayList<E> lst = root;
//                    Object[] a;
//                    if ((a = lst.elementData) != null) {
//                        if ((hi = fence) < 0) {
//                            mc = modCount;
//                            hi = offset + size;
//                        }
//                        else
//                            mc = expectedModCount;
//                        if ((i = index) >= 0 && (index = hi) <= a.length) {
//                            for (; i < hi; ++i) {
//                                @SuppressWarnings("unchecked") E e = (E) a[i];
//                                action.accept(e);
//                            }
//                            if (lst.modCount == mc)
//                                return;
//                        }
//                    }
//                    throw new ConcurrentModificationException();
//                }
//
//                public long estimateSize() {
//                    return getFence() - index;
//                }
//
//                public int characteristics() {
//                    return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
//                }
//            };
//        }
//    }
//
//    /**
//     * @throws NullPointerException {@inheritDoc}
//     */
//    @Override
//    public void forEach(Consumer<? super E> action) {
//        Objects.requireNonNull(action);
//        final int expectedModCount = modCount;
//        final Object[] es = elementData;
//        final int size = this.size;
//        for (int i = 0; modCount == expectedModCount && i < size; i++)
//            action.accept(elementAt(es, i));
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
//    }
//
//    /**
//     * Creates a <em><a href="Spliterator.html#binding">late-binding</a></em>
//     * and <em>fail-fast</em> {@link Spliterator} over the elements in this
//     * list.
//     *
//     * <p>The {@code Spliterator} reports {@link Spliterator#SIZED},
//     * {@link Spliterator#SUBSIZED}, and {@link Spliterator#ORDERED}.
//     * Overriding implementations should document the reporting of additional
//     * characteristic values.
//     *
//     * @return a {@code Spliterator} over the elements in this list
//     * @since 1.8
//     */
//    @Override
//    public Spliterator<E> spliterator() {
//        return new java.util.ArrayList.ArrayListSpliterator(0, -1, 0);
//    }
//
//    /** Index-based split-by-two, lazily initialized Spliterator */
//    final class ArrayListSpliterator implements Spliterator<E> {
//
//        /*
//         * If ArrayLists were immutable, or structurally immutable (no
//         * adds, removes, etc), we could implement their spliterators
//         * with Arrays.spliterator. Instead we detect as much
//         * interference during traversal as practical without
//         * sacrificing much performance. We rely primarily on
//         * modCounts. These are not guaranteed to detect concurrency
//         * violations, and are sometimes overly conservative about
//         * within-thread interference, but detect enough problems to
//         * be worthwhile in practice. To carry this out, we (1) lazily
//         * initialize fence and expectedModCount until the latest
//         * point that we need to commit to the state we are checking
//         * against; thus improving precision.  (This doesn't apply to
//         * SubLists, that create spliterators with current non-lazy
//         * values).  (2) We perform only a single
//         * ConcurrentModificationException check at the end of forEach
//         * (the most performance-sensitive method). When using forEach
//         * (as opposed to iterators), we can normally only detect
//         * interference after actions, not before. Further
//         * CME-triggering checks apply to all other possible
//         * violations of assumptions for example null or too-small
//         * elementData array given its size(), that could only have
//         * occurred due to interference.  This allows the inner loop
//         * of forEach to run without any further checks, and
//         * simplifies lambda-resolution. While this does entail a
//         * number of checks, note that in the common case of
//         * list.stream().forEach(a), no checks or other computation
//         * occur anywhere other than inside forEach itself.  The other
//         * less-often-used methods cannot take advantage of most of
//         * these streamlinings.
//         */
//
//        private int index; // current index, modified on advance/split
//        private int fence; // -1 until used; then one past last index
//        private int expectedModCount; // initialized when fence set
//
//        /** Creates new spliterator covering the given range. */
//        ArrayListSpliterator(int origin, int fence, int expectedModCount) {
//            this.index = origin;
//            this.fence = fence;
//            this.expectedModCount = expectedModCount;
//        }
//
//        private int getFence() { // initialize fence to size on first use
//            int hi; // (a specialized variant appears in method forEach)
//            if ((hi = fence) < 0) {
//                expectedModCount = modCount;
//                hi = fence = size;
//            }
//            return hi;
//        }
//
//        public java.util.ArrayList.ArrayListSpliterator trySplit() {
//            int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
//            return (lo >= mid) ? null : // divide range in half unless too small
//                    new java.util.ArrayList.ArrayListSpliterator(lo, index = mid, expectedModCount);
//        }
//
//        public boolean tryAdvance(Consumer<? super E> action) {
//            if (action == null)
//                throw new NullPointerException();
//            int hi = getFence(), i = index;
//            if (i < hi) {
//                index = i + 1;
//                @SuppressWarnings("unchecked") E e = (E)elementData[i];
//                action.accept(e);
//                if (modCount != expectedModCount)
//                    throw new ConcurrentModificationException();
//                return true;
//            }
//            return false;
//        }
//
//        public void forEachRemaining(Consumer<? super E> action) {
//            int i, hi, mc; // hoist accesses and checks from loop
//            Object[] a;
//            if (action == null)
//                throw new NullPointerException();
//            if ((a = elementData) != null) {
//                if ((hi = fence) < 0) {
//                    mc = modCount;
//                    hi = size;
//                }
//                else
//                    mc = expectedModCount;
//                if ((i = index) >= 0 && (index = hi) <= a.length) {
//                    for (; i < hi; ++i) {
//                        @SuppressWarnings("unchecked") E e = (E) a[i];
//                        action.accept(e);
//                    }
//                    if (modCount == mc)
//                        return;
//                }
//            }
//            throw new ConcurrentModificationException();
//        }
//
//        public long estimateSize() {
//            return getFence() - index;
//        }
//
//        public int characteristics() {
//            return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
//        }
//    }
//
//    // A tiny bit set implementation
//
//    private static long[] nBits(int n) {
//        return new long[((n - 1) >> 6) + 1];
//    }
//    private static void setBit(long[] bits, int i) {
//        bits[i >> 6] |= 1L << i;
//    }
//    private static boolean isClear(long[] bits, int i) {
//        return (bits[i >> 6] & (1L << i)) == 0;
//    }
//
//    /**
//     * @throws NullPointerException {@inheritDoc}
//     */
//    @Override
//    public boolean removeIf(Predicate<? super E> filter) {
//        return removeIf(filter, 0, size);
//    }
//
//    /**
//     * Removes all elements satisfying the given predicate, from index
//     * i (inclusive) to index end (exclusive).
//     */
//    boolean removeIf(Predicate<? super E> filter, int i, final int end) {
//        Objects.requireNonNull(filter);
//        int expectedModCount = modCount;
//        final Object[] es = elementData;
//        // Optimize for initial run of survivors
//        for (; i < end && !filter.test(elementAt(es, i)); i++)
//            ;
//        // Tolerate predicates that reentrantly access the collection for
//        // read (but writers still get CME), so traverse once to find
//        // elements to delete, a second pass to physically expunge.
//        if (i < end) {
//            final int beg = i;
//            final long[] deathRow = nBits(end - beg);
//            deathRow[0] = 1L;   // set bit 0
//            for (i = beg + 1; i < end; i++)
//                if (filter.test(elementAt(es, i)))
//                    setBit(deathRow, i - beg);
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//            modCount++;
//            int w = beg;
//            for (i = beg; i < end; i++)
//                if (isClear(deathRow, i - beg))
//                    es[w++] = es[i];
//            shiftTailOverGap(es, w, end);
//            return true;
//        } else {
//            if (modCount != expectedModCount)
//                throw new ConcurrentModificationException();
//            return false;
//        }
//    }
//
//    @Override
//    public void replaceAll(UnaryOperator<E> operator) {
//        replaceAllRange(operator, 0, size);
//        // TODO(8203662): remove increment of modCount from ...
//        modCount++;
//    }
//
//    private void replaceAllRange(UnaryOperator<E> operator, int i, int end) {
//        Objects.requireNonNull(operator);
//        final int expectedModCount = modCount;
//        final Object[] es = elementData;
//        for (; modCount == expectedModCount && i < end; i++)
//            es[i] = operator.apply(elementAt(es, i));
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public void sort(Comparator<? super E> c) {
//        final int expectedModCount = modCount;
//        Arrays.sort((E[]) elementData, 0, size, c);
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
//        modCount++;
//    }
//
//    void checkInvariants() {
//        // assert size >= 0;
//        // assert size == elementData.length || elementData[size] == null;
//    }
//}


///*
// * Copyright (c) 1994, 2020, Oracle and/or its affiliates. All rights reserved.
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
// *
// * This code is free software; you can redistribute it and/or modify it
// * under the terms of the GNU General Public License version 2 only, as
// * published by the Free Software Foundation.  Oracle designates this
// * particular file as subject to the "Classpath" exception as provided
// * by Oracle in the LICENSE file that accompanied this code.
// *
// * This code is distributed in the hope that it will be useful, but WITHOUT
// * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// * version 2 for more details (a copy is included in the LICENSE file that
// * accompanied this code).
// *
// * You should have received a copy of the GNU General Public License version
// * 2 along with this work; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
// *
// * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// * or visit www.oracle.com if you need additional information or have any
// * questions.
// */
//
//package java.lang;
//
//        import java.lang.annotation.Native;
//        import java.lang.invoke.MethodHandles;
//        import java.lang.constant.Constable;
//        import java.lang.constant.ConstantDesc;
//        import java.util.Objects;
//        import java.util.Optional;
//
//        import jdk.internal.misc.CDS;
//        import jdk.internal.misc.VM;
//        import jdk.internal.vm.annotation.IntrinsicCandidate;
//
//        import static java.lang.String.COMPACT_STRINGS;
//        import static java.lang.String.LATIN1;
//        import static java.lang.String.UTF16;
//
///**
// * The {@code Integer} class wraps a value of the primitive type
// * {@code int} in an object. An object of type {@code Integer}
// * contains a single field whose type is {@code int}.
// *
// * <p>In addition, this class provides several methods for converting
// * an {@code int} to a {@code String} and a {@code String} to an
// * {@code int}, as well as other constants and methods useful when
// * dealing with an {@code int}.
// *
// * <p>This is a <a href="{@docRoot}/java.base/java/lang/doc-files/ValueBased.html">value-based</a>
// * class; programmers should treat instances that are
// * {@linkplain #equals(Object) equal} as interchangeable and should not
// * use instances for synchronization, or unpredictable behavior may
// * occur. For example, in a future release, synchronization may fail.
// *
// * <p>Implementation note: The implementations of the "bit twiddling"
// * methods (such as {@link #highestOneBit(int) highestOneBit} and
// * {@link #numberOfTrailingZeros(int) numberOfTrailingZeros}) are
// * based on material from Henry S. Warren, Jr.'s <i>Hacker's
// * Delight</i>, (Addison Wesley, 2002).
// *
// * @author  Lee Boynton
// * @author  Arthur van Hoff
// * @author  Josh Bloch
// * @author  Joseph D. Darcy
// * @since 1.0
// */
//@jdk.internal.ValueBased
//public final class Integer extends Number
//        implements Comparable<java.lang.Integer>, Constable, ConstantDesc {
//    /**
//     * A constant holding the minimum value an {@code int} can
//     * have, -2<sup>31</sup>.
//     */
//    @Native public static final int   MIN_VALUE = 0x80000000;
//
//    /**
//     * A constant holding the maximum value an {@code int} can
//     * have, 2<sup>31</sup>-1.
//     */
//    @Native public static final int   MAX_VALUE = 0x7fffffff;
//
//    /**
//     * The {@code Class} instance representing the primitive type
//     * {@code int}.
//     *
//     * @since   1.1
//     */
//    @SuppressWarnings("unchecked")
//    public static final Class<java.lang.Integer>  TYPE = (Class<java.lang.Integer>) Class.getPrimitiveClass("int");
//
//    /**
//     * All possible chars for representing a number as a String
//     */
//    static final char[] digits = {
//            '0' , '1' , '2' , '3' , '4' , '5' ,
//            '6' , '7' , '8' , '9' , 'a' , 'b' ,
//            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
//            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
//            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
//            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
//    };
//
//    /**
//     * Returns a string representation of the first argument in the
//     * radix specified by the second argument.
//     *
//     * <p>If the radix is smaller than {@code Character.MIN_RADIX}
//     * or larger than {@code Character.MAX_RADIX}, then the radix
//     * {@code 10} is used instead.
//     *
//     * <p>If the first argument is negative, the first element of the
//     * result is the ASCII minus character {@code '-'}
//     * ({@code '\u005Cu002D'}). If the first argument is not
//     * negative, no sign character appears in the result.
//     *
//     * <p>The remaining characters of the result represent the magnitude
//     * of the first argument. If the magnitude is zero, it is
//     * represented by a single zero character {@code '0'}
//     * ({@code '\u005Cu0030'}); otherwise, the first character of
//     * the representation of the magnitude will not be the zero
//     * character.  The following ASCII characters are used as digits:
//     *
//     * <blockquote>
//     *   {@code 0123456789abcdefghijklmnopqrstuvwxyz}
//     * </blockquote>
//     *
//     * These are {@code '\u005Cu0030'} through
//     * {@code '\u005Cu0039'} and {@code '\u005Cu0061'} through
//     * {@code '\u005Cu007A'}. If {@code radix} is
//     * <var>N</var>, then the first <var>N</var> of these characters
//     * are used as radix-<var>N</var> digits in the order shown. Thus,
//     * the digits for hexadecimal (radix 16) are
//     * {@code 0123456789abcdef}. If uppercase letters are
//     * desired, the {@link java.lang.String#toUpperCase()} method may
//     * be called on the result:
//     *
//     * <blockquote>
//     *  {@code Integer.toString(n, 16).toUpperCase()}
//     * </blockquote>
//     *
//     * @param   i       an integer to be converted to a string.
//     * @param   radix   the radix to use in the string representation.
//     * @return  a string representation of the argument in the specified radix.
//     * @see     java.lang.Character#MAX_RADIX
//     * @see     java.lang.Character#MIN_RADIX
//     */
//    public static String toString(int i, int radix) {
//        if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX)
//            radix = 10;
//
//        /* Use the faster version */
//        if (radix == 10) {
//            return toString(i);
//        }
//
//        if (COMPACT_STRINGS) {
//            byte[] buf = new byte[33];
//            boolean negative = (i < 0);
//            int charPos = 32;
//
//            if (!negative) {
//                i = -i;
//            }
//
//            while (i <= -radix) {
//                buf[charPos--] = (byte)digits[-(i % radix)];
//                i = i / radix;
//            }
//            buf[charPos] = (byte)digits[-i];
//
//            if (negative) {
//                buf[--charPos] = '-';
//            }
//
//            return StringLatin1.newString(buf, charPos, (33 - charPos));
//        }
//        return toStringUTF16(i, radix);
//    }
//
//    private static String toStringUTF16(int i, int radix) {
//        byte[] buf = new byte[33 * 2];
//        boolean negative = (i < 0);
//        int charPos = 32;
//        if (!negative) {
//            i = -i;
//        }
//        while (i <= -radix) {
//            StringUTF16.putChar(buf, charPos--, digits[-(i % radix)]);
//            i = i / radix;
//        }
//        StringUTF16.putChar(buf, charPos, digits[-i]);
//
//        if (negative) {
//            StringUTF16.putChar(buf, --charPos, '-');
//        }
//        return StringUTF16.newString(buf, charPos, (33 - charPos));
//    }
//
//    /**
//     * Returns a string representation of the first argument as an
//     * unsigned integer value in the radix specified by the second
//     * argument.
//     *
//     * <p>If the radix is smaller than {@code Character.MIN_RADIX}
//     * or larger than {@code Character.MAX_RADIX}, then the radix
//     * {@code 10} is used instead.
//     *
//     * <p>Note that since the first argument is treated as an unsigned
//     * value, no leading sign character is printed.
//     *
//     * <p>If the magnitude is zero, it is represented by a single zero
//     * character {@code '0'} ({@code '\u005Cu0030'}); otherwise,
//     * the first character of the representation of the magnitude will
//     * not be the zero character.
//     *
//     * <p>The behavior of radixes and the characters used as digits
//     * are the same as {@link #toString(int, int) toString}.
//     *
//     * @param   i       an integer to be converted to an unsigned string.
//     * @param   radix   the radix to use in the string representation.
//     * @return  an unsigned string representation of the argument in the specified radix.
//     * @see     #toString(int, int)
//     * @since 1.8
//     */
//    public static String toUnsignedString(int i, int radix) {
//        return Long.toUnsignedString(toUnsignedLong(i), radix);
//    }
//
//    /**
//     * Returns a string representation of the integer argument as an
//     * unsigned integer in base&nbsp;16.
//     *
//     * <p>The unsigned integer value is the argument plus 2<sup>32</sup>
//     * if the argument is negative; otherwise, it is equal to the
//     * argument.  This value is converted to a string of ASCII digits
//     * in hexadecimal (base&nbsp;16) with no extra leading
//     * {@code 0}s.
//     *
//     * <p>The value of the argument can be recovered from the returned
//     * string {@code s} by calling {@link
//     * java.lang.Integer#parseUnsignedInt(String, int)
//     * Integer.parseUnsignedInt(s, 16)}.
//     *
//     * <p>If the unsigned magnitude is zero, it is represented by a
//     * single zero character {@code '0'} ({@code '\u005Cu0030'});
//     * otherwise, the first character of the representation of the
//     * unsigned magnitude will not be the zero character. The
//     * following characters are used as hexadecimal digits:
//     *
//     * <blockquote>
//     *  {@code 0123456789abcdef}
//     * </blockquote>
//     *
//     * These are the characters {@code '\u005Cu0030'} through
//     * {@code '\u005Cu0039'} and {@code '\u005Cu0061'} through
//     * {@code '\u005Cu0066'}. If uppercase letters are
//     * desired, the {@link java.lang.String#toUpperCase()} method may
//     * be called on the result:
//     *
//     * <blockquote>
//     *  {@code Integer.toHexString(n).toUpperCase()}
//     * </blockquote>
//     *
//     * @param   i   an integer to be converted to a string.
//     * @return  the string representation of the unsigned integer value
//     *          represented by the argument in hexadecimal (base&nbsp;16).
//     * @see #parseUnsignedInt(String, int)
//     * @see #toUnsignedString(int, int)
//     * @since   1.0.2
//     */
//    public static String toHexString(int i) {
//        return toUnsignedString0(i, 4);
//    }
//
//    /**
//     * Returns a string representation of the integer argument as an
//     * unsigned integer in base&nbsp;8.
//     *
//     * <p>The unsigned integer value is the argument plus 2<sup>32</sup>
//     * if the argument is negative; otherwise, it is equal to the
//     * argument.  This value is converted to a string of ASCII digits
//     * in octal (base&nbsp;8) with no extra leading {@code 0}s.
//     *
//     * <p>The value of the argument can be recovered from the returned
//     * string {@code s} by calling {@link
//     * java.lang.Integer#parseUnsignedInt(String, int)
//     * Integer.parseUnsignedInt(s, 8)}.
//     *
//     * <p>If the unsigned magnitude is zero, it is represented by a
//     * single zero character {@code '0'} ({@code '\u005Cu0030'});
//     * otherwise, the first character of the representation of the
//     * unsigned magnitude will not be the zero character. The
//     * following characters are used as octal digits:
//     *
//     * <blockquote>
//     * {@code 01234567}
//     * </blockquote>
//     *
//     * These are the characters {@code '\u005Cu0030'} through
//     * {@code '\u005Cu0037'}.
//     *
//     * @param   i   an integer to be converted to a string.
//     * @return  the string representation of the unsigned integer value
//     *          represented by the argument in octal (base&nbsp;8).
//     * @see #parseUnsignedInt(String, int)
//     * @see #toUnsignedString(int, int)
//     * @since   1.0.2
//     */
//    public static String toOctalString(int i) {
//        return toUnsignedString0(i, 3);
//    }
//
//    /**
//     * Returns a string representation of the integer argument as an
//     * unsigned integer in base&nbsp;2.
//     *
//     * <p>The unsigned integer value is the argument plus 2<sup>32</sup>
//     * if the argument is negative; otherwise it is equal to the
//     * argument.  This value is converted to a string of ASCII digits
//     * in binary (base&nbsp;2) with no extra leading {@code 0}s.
//     *
//     * <p>The value of the argument can be recovered from the returned
//     * string {@code s} by calling {@link
//     * java.lang.Integer#parseUnsignedInt(String, int)
//     * Integer.parseUnsignedInt(s, 2)}.
//     *
//     * <p>If the unsigned magnitude is zero, it is represented by a
//     * single zero character {@code '0'} ({@code '\u005Cu0030'});
//     * otherwise, the first character of the representation of the
//     * unsigned magnitude will not be the zero character. The
//     * characters {@code '0'} ({@code '\u005Cu0030'}) and {@code
//     * '1'} ({@code '\u005Cu0031'}) are used as binary digits.
//     *
//     * @param   i   an integer to be converted to a string.
//     * @return  the string representation of the unsigned integer value
//     *          represented by the argument in binary (base&nbsp;2).
//     * @see #parseUnsignedInt(String, int)
//     * @see #toUnsignedString(int, int)
//     * @since   1.0.2
//     */
//    public static String toBinaryString(int i) {
//        return toUnsignedString0(i, 1);
//    }
//
//    /**
//     * Convert the integer to an unsigned number.
//     */
//    private static String toUnsignedString0(int val, int shift) {
//        // assert shift > 0 && shift <=5 : "Illegal shift value";
//        int mag = java.lang.Integer.SIZE - java.lang.Integer.numberOfLeadingZeros(val);
//        int chars = Math.max(((mag + (shift - 1)) / shift), 1);
//        if (COMPACT_STRINGS) {
//            byte[] buf = new byte[chars];
//            formatUnsignedInt(val, shift, buf, chars);
//            return new String(buf, LATIN1);
//        } else {
//            byte[] buf = new byte[chars * 2];
//            formatUnsignedIntUTF16(val, shift, buf, chars);
//            return new String(buf, UTF16);
//        }
//    }
//
//    /**
//     * Format an {@code int} (treated as unsigned) into a byte buffer (LATIN1 version). If
//     * {@code len} exceeds the formatted ASCII representation of {@code val},
//     * {@code buf} will be padded with leading zeroes.
//     *
//     * @param val the unsigned int to format
//     * @param shift the log2 of the base to format in (4 for hex, 3 for octal, 1 for binary)
//     * @param buf the byte buffer to write to
//     * @param len the number of characters to write
//     */
//    private static void formatUnsignedInt(int val, int shift, byte[] buf, int len) {
//        int charPos = len;
//        int radix = 1 << shift;
//        int mask = radix - 1;
//        do {
//            buf[--charPos] = (byte) java.lang.Integer.digits[val & mask];
//            val >>>= shift;
//        } while (charPos > 0);
//    }
//
//    /**
//     * Format an {@code int} (treated as unsigned) into a byte buffer (UTF16 version). If
//     * {@code len} exceeds the formatted ASCII representation of {@code val},
//     * {@code buf} will be padded with leading zeroes.
//     *
//     * @param val the unsigned int to format
//     * @param shift the log2 of the base to format in (4 for hex, 3 for octal, 1 for binary)
//     * @param buf the byte buffer to write to
//     * @param len the number of characters to write
//     */
//    private static void formatUnsignedIntUTF16(int val, int shift, byte[] buf, int len) {
//        int charPos = len;
//        int radix = 1 << shift;
//        int mask = radix - 1;
//        do {
//            StringUTF16.putChar(buf, --charPos, java.lang.Integer.digits[val & mask]);
//            val >>>= shift;
//        } while (charPos > 0);
//    }
//
//    static final byte[] DigitTens = {
//            '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
//            '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
//            '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
//            '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
//            '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
//            '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
//            '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
//            '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
//            '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
//            '9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
//    } ;
//
//    static final byte[] DigitOnes = {
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//    } ;
//
//
//    /**
//     * Returns a {@code String} object representing the
//     * specified integer. The argument is converted to signed decimal
//     * representation and returned as a string, exactly as if the
//     * argument and radix 10 were given as arguments to the {@link
//     * #toString(int, int)} method.
//     *
//     * @param   i   an integer to be converted.
//     * @return  a string representation of the argument in base&nbsp;10.
//     */
//    @IntrinsicCandidate
//    public static String toString(int i) {
//        int size = stringSize(i);
//        if (COMPACT_STRINGS) {
//            byte[] buf = new byte[size];
//            getChars(i, size, buf);
//            return new String(buf, LATIN1);
//        } else {
//            byte[] buf = new byte[size * 2];
//            StringUTF16.getChars(i, size, buf);
//            return new String(buf, UTF16);
//        }
//    }
//
//    /**
//     * Returns a string representation of the argument as an unsigned
//     * decimal value.
//     *
//     * The argument is converted to unsigned decimal representation
//     * and returned as a string exactly as if the argument and radix
//     * 10 were given as arguments to the {@link #toUnsignedString(int,
//     * int)} method.
//     *
//     * @param   i  an integer to be converted to an unsigned string.
//     * @return  an unsigned string representation of the argument.
//     * @see     #toUnsignedString(int, int)
//     * @since 1.8
//     */
//    public static String toUnsignedString(int i) {
//        return Long.toString(toUnsignedLong(i));
//    }
//
//    /**
//     * Places characters representing the integer i into the
//     * character array buf. The characters are placed into
//     * the buffer backwards starting with the least significant
//     * digit at the specified index (exclusive), and working
//     * backwards from there.
//     *
//     * @implNote This method converts positive inputs into negative
//     * values, to cover the Integer.MIN_VALUE case. Converting otherwise
//     * (negative to positive) will expose -Integer.MIN_VALUE that overflows
//     * integer.
//     *
//     * @param i     value to convert
//     * @param index next index, after the least significant digit
//     * @param buf   target buffer, Latin1-encoded
//     * @return index of the most significant digit or minus sign, if present
//     */
//    static int getChars(int i, int index, byte[] buf) {
//        int q, r;
//        int charPos = index;
//
//        boolean negative = i < 0;
//        if (!negative) {
//            i = -i;
//        }
//
//        // Generate two digits per iteration
//        while (i <= -100) {
//            q = i / 100;
//            r = (q * 100) - i;
//            i = q;
//            buf[--charPos] = DigitOnes[r];
//            buf[--charPos] = DigitTens[r];
//        }
//
//        // We know there are at most two digits left at this point.
//        q = i / 10;
//        r = (q * 10) - i;
//        buf[--charPos] = (byte)('0' + r);
//
//        // Whatever left is the remaining digit.
//        if (q < 0) {
//            buf[--charPos] = (byte)('0' - q);
//        }
//
//        if (negative) {
//            buf[--charPos] = (byte)'-';
//        }
//        return charPos;
//    }
//
//    // Left here for compatibility reasons, see JDK-8143900.
//    static final int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
//            99999999, 999999999, java.lang.Integer.MAX_VALUE };
//
//    /**
//     * Returns the string representation size for a given int value.
//     *
//     * @param x int value
//     * @return string size
//     *
//     * @implNote There are other ways to compute this: e.g. binary search,
//     * but values are biased heavily towards zero, and therefore linear search
//     * wins. The iteration results are also routinely inlined in the generated
//     * code after loop unrolling.
//     */
//    static int stringSize(int x) {
//        int d = 1;
//        if (x >= 0) {
//            d = 0;
//            x = -x;
//        }
//        int p = -10;
//        for (int i = 1; i < 10; i++) {
//            if (x > p)
//                return i + d;
//            p = 10 * p;
//        }
//        return 10 + d;
//    }
//
//    /**
//     * Parses the string argument as a signed integer in the radix
//     * specified by the second argument. The characters in the string
//     * must all be digits of the specified radix (as determined by
//     * whether {@link java.lang.Character#digit(char, int)} returns a
//     * nonnegative value), except that the first character may be an
//     * ASCII minus sign {@code '-'} ({@code '\u005Cu002D'}) to
//     * indicate a negative value or an ASCII plus sign {@code '+'}
//     * ({@code '\u005Cu002B'}) to indicate a positive value. The
//     * resulting integer value is returned.
//     *
//     * <p>An exception of type {@code NumberFormatException} is
//     * thrown if any of the following situations occurs:
//     * <ul>
//     * <li>The first argument is {@code null} or is a string of
//     * length zero.
//     *
//     * <li>The radix is either smaller than
//     * {@link java.lang.Character#MIN_RADIX} or
//     * larger than {@link java.lang.Character#MAX_RADIX}.
//     *
//     * <li>Any character of the string is not a digit of the specified
//     * radix, except that the first character may be a minus sign
//     * {@code '-'} ({@code '\u005Cu002D'}) or plus sign
//     * {@code '+'} ({@code '\u005Cu002B'}) provided that the
//     * string is longer than length 1.
//     *
//     * <li>The value represented by the string is not a value of type
//     * {@code int}.
//     * </ul>
//     *
//     * <p>Examples:
//     * <blockquote><pre>
//     * parseInt("0", 10) returns 0
//     * parseInt("473", 10) returns 473
//     * parseInt("+42", 10) returns 42
//     * parseInt("-0", 10) returns 0
//     * parseInt("-FF", 16) returns -255
//     * parseInt("1100110", 2) returns 102
//     * parseInt("2147483647", 10) returns 2147483647
//     * parseInt("-2147483648", 10) returns -2147483648
//     * parseInt("2147483648", 10) throws a NumberFormatException
//     * parseInt("99", 8) throws a NumberFormatException
//     * parseInt("Kona", 10) throws a NumberFormatException
//     * parseInt("Kona", 27) returns 411787
//     * </pre></blockquote>
//     *
//     * @param      s   the {@code String} containing the integer
//     *                  representation to be parsed
//     * @param      radix   the radix to be used while parsing {@code s}.
//     * @return     the integer represented by the string argument in the
//     *             specified radix.
//     * @throws     NumberFormatException if the {@code String}
//     *             does not contain a parsable {@code int}.
//     */
//    public static int parseInt(String s, int radix)
//            throws NumberFormatException
//    {
//        /*
//         * WARNING: This method may be invoked early during VM initialization
//         * before IntegerCache is initialized. Care must be taken to not use
//         * the valueOf method.
//         */
//
//        if (s == null) {
//            throw new NumberFormatException("null");
//        }
//
//        if (radix < Character.MIN_RADIX) {
//            throw new NumberFormatException("radix " + radix +
//                    " less than Character.MIN_RADIX");
//        }
//
//        if (radix > Character.MAX_RADIX) {
//            throw new NumberFormatException("radix " + radix +
//                    " greater than Character.MAX_RADIX");
//        }
//
//        boolean negative = false;
//        int i = 0, len = s.length();
//        int limit = -java.lang.Integer.MAX_VALUE;
//
//        if (len > 0) {
//            char firstChar = s.charAt(0);
//            if (firstChar < '0') { // Possible leading "+" or "-"
//                if (firstChar == '-') {
//                    negative = true;
//                    limit = java.lang.Integer.MIN_VALUE;
//                } else if (firstChar != '+') {
//                    throw NumberFormatException.forInputString(s, radix);
//                }
//
//                if (len == 1) { // Cannot have lone "+" or "-"
//                    throw NumberFormatException.forInputString(s, radix);
//                }
//                i++;
//            }
//            int multmin = limit / radix;
//            int result = 0;
//            while (i < len) {
//                // Accumulating negatively avoids surprises near MAX_VALUE
//                int digit = Character.digit(s.charAt(i++), radix);
//                if (digit < 0 || result < multmin) {
//                    throw NumberFormatException.forInputString(s, radix);
//                }
//                result *= radix;
//                if (result < limit + digit) {
//                    throw NumberFormatException.forInputString(s, radix);
//                }
//                result -= digit;
//            }
//            return negative ? result : -result;
//        } else {
//            throw NumberFormatException.forInputString(s, radix);
//        }
//    }
//
//    /**
//     * Parses the {@link CharSequence} argument as a signed {@code int} in the
//     * specified {@code radix}, beginning at the specified {@code beginIndex}
//     * and extending to {@code endIndex - 1}.
//     *
//     * <p>The method does not take steps to guard against the
//     * {@code CharSequence} being mutated while parsing.
//     *
//     * @param      s   the {@code CharSequence} containing the {@code int}
//     *                  representation to be parsed
//     * @param      beginIndex   the beginning index, inclusive.
//     * @param      endIndex     the ending index, exclusive.
//     * @param      radix   the radix to be used while parsing {@code s}.
//     * @return     the signed {@code int} represented by the subsequence in
//     *             the specified radix.
//     * @throws     NullPointerException  if {@code s} is null.
//     * @throws     IndexOutOfBoundsException  if {@code beginIndex} is
//     *             negative, or if {@code beginIndex} is greater than
//     *             {@code endIndex} or if {@code endIndex} is greater than
//     *             {@code s.length()}.
//     * @throws     NumberFormatException  if the {@code CharSequence} does not
//     *             contain a parsable {@code int} in the specified
//     *             {@code radix}, or if {@code radix} is either smaller than
//     *             {@link java.lang.Character#MIN_RADIX} or larger than
//     *             {@link java.lang.Character#MAX_RADIX}.
//     * @since  9
//     */
//    public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix)
//            throws NumberFormatException {
//        Objects.requireNonNull(s);
//
//        if (beginIndex < 0 || beginIndex > endIndex || endIndex > s.length()) {
//            throw new IndexOutOfBoundsException();
//        }
//        if (radix < Character.MIN_RADIX) {
//            throw new NumberFormatException("radix " + radix +
//                    " less than Character.MIN_RADIX");
//        }
//        if (radix > Character.MAX_RADIX) {
//            throw new NumberFormatException("radix " + radix +
//                    " greater than Character.MAX_RADIX");
//        }
//
//        boolean negative = false;
//        int i = beginIndex;
//        int limit = -java.lang.Integer.MAX_VALUE;
//
//        if (i < endIndex) {
//            char firstChar = s.charAt(i);
//            if (firstChar < '0') { // Possible leading "+" or "-"
//                if (firstChar == '-') {
//                    negative = true;
//                    limit = java.lang.Integer.MIN_VALUE;
//                } else if (firstChar != '+') {
//                    throw NumberFormatException.forCharSequence(s, beginIndex,
//                            endIndex, i);
//                }
//                i++;
//                if (i == endIndex) { // Cannot have lone "+" or "-"
//                    throw NumberFormatException.forCharSequence(s, beginIndex,
//                            endIndex, i);
//                }
//            }
//            int multmin = limit / radix;
//            int result = 0;
//            while (i < endIndex) {
//                // Accumulating negatively avoids surprises near MAX_VALUE
//                int digit = Character.digit(s.charAt(i), radix);
//                if (digit < 0 || result < multmin) {
//                    throw NumberFormatException.forCharSequence(s, beginIndex,
//                            endIndex, i);
//                }
//                result *= radix;
//                if (result < limit + digit) {
//                    throw NumberFormatException.forCharSequence(s, beginIndex,
//                            endIndex, i);
//                }
//                i++;
//                result -= digit;
//            }
//            return negative ? result : -result;
//        } else {
//            throw NumberFormatException.forInputString("", radix);
//        }
//    }
//
//    /**
//     * Parses the string argument as a signed decimal integer. The
//     * characters in the string must all be decimal digits, except
//     * that the first character may be an ASCII minus sign {@code '-'}
//     * ({@code '\u005Cu002D'}) to indicate a negative value or an
//     * ASCII plus sign {@code '+'} ({@code '\u005Cu002B'}) to
//     * indicate a positive value. The resulting integer value is
//     * returned, exactly as if the argument and the radix 10 were
//     * given as arguments to the {@link #parseInt(java.lang.String,
//     * int)} method.
//     *
//     * @param s    a {@code String} containing the {@code int}
//     *             representation to be parsed
//     * @return     the integer value represented by the argument in decimal.
//     * @throws     NumberFormatException  if the string does not contain a
//     *               parsable integer.
//     */
//    public static int parseInt(String s) throws NumberFormatException {
//        return parseInt(s,10);
//    }
//
//    /**
//     * Parses the string argument as an unsigned integer in the radix
//     * specified by the second argument.  An unsigned integer maps the
//     * values usually associated with negative numbers to positive
//     * numbers larger than {@code MAX_VALUE}.
//     *
//     * The characters in the string must all be digits of the
//     * specified radix (as determined by whether {@link
//     * java.lang.Character#digit(char, int)} returns a nonnegative
//     * value), except that the first character may be an ASCII plus
//     * sign {@code '+'} ({@code '\u005Cu002B'}). The resulting
//     * integer value is returned.
//     *
//     * <p>An exception of type {@code NumberFormatException} is
//     * thrown if any of the following situations occurs:
//     * <ul>
//     * <li>The first argument is {@code null} or is a string of
//     * length zero.
//     *
//     * <li>The radix is either smaller than
//     * {@link java.lang.Character#MIN_RADIX} or
//     * larger than {@link java.lang.Character#MAX_RADIX}.
//     *
//     * <li>Any character of the string is not a digit of the specified
//     * radix, except that the first character may be a plus sign
//     * {@code '+'} ({@code '\u005Cu002B'}) provided that the
//     * string is longer than length 1.
//     *
//     * <li>The value represented by the string is larger than the
//     * largest unsigned {@code int}, 2<sup>32</sup>-1.
//     *
//     * </ul>
//     *
//     *
//     * @param      s   the {@code String} containing the unsigned integer
//     *                  representation to be parsed
//     * @param      radix   the radix to be used while parsing {@code s}.
//     * @return     the integer represented by the string argument in the
//     *             specified radix.
//     * @throws     NumberFormatException if the {@code String}
//     *             does not contain a parsable {@code int}.
//     * @since 1.8
//     */
//    public static int parseUnsignedInt(String s, int radix)
//            throws NumberFormatException {
//        if (s == null)  {
//            throw new NumberFormatException("null");
//        }
//
//        int len = s.length();
//        if (len > 0) {
//            char firstChar = s.charAt(0);
//            if (firstChar == '-') {
//                throw new
//                        NumberFormatException(String.format("Illegal leading minus sign " +
//                        "on unsigned string %s.", s));
//            } else {
//                if (len <= 5 || // Integer.MAX_VALUE in Character.MAX_RADIX is 6 digits
//                        (radix == 10 && len <= 9) ) { // Integer.MAX_VALUE in base 10 is 10 digits
//                    return parseInt(s, radix);
//                } else {
//                    long ell = Long.parseLong(s, radix);
//                    if ((ell & 0xffff_ffff_0000_0000L) == 0) {
//                        return (int) ell;
//                    } else {
//                        throw new
//                                NumberFormatException(String.format("String value %s exceeds " +
//                                "range of unsigned int.", s));
//                    }
//                }
//            }
//        } else {
//            throw NumberFormatException.forInputString(s, radix);
//        }
//    }
//
//    /**
//     * Parses the {@link CharSequence} argument as an unsigned {@code int} in
//     * the specified {@code radix}, beginning at the specified
//     * {@code beginIndex} and extending to {@code endIndex - 1}.
//     *
//     * <p>The method does not take steps to guard against the
//     * {@code CharSequence} being mutated while parsing.
//     *
//     * @param      s   the {@code CharSequence} containing the unsigned
//     *                 {@code int} representation to be parsed
//     * @param      beginIndex   the beginning index, inclusive.
//     * @param      endIndex     the ending index, exclusive.
//     * @param      radix   the radix to be used while parsing {@code s}.
//     * @return     the unsigned {@code int} represented by the subsequence in
//     *             the specified radix.
//     * @throws     NullPointerException  if {@code s} is null.
//     * @throws     IndexOutOfBoundsException  if {@code beginIndex} is
//     *             negative, or if {@code beginIndex} is greater than
//     *             {@code endIndex} or if {@code endIndex} is greater than
//     *             {@code s.length()}.
//     * @throws     NumberFormatException  if the {@code CharSequence} does not
//     *             contain a parsable unsigned {@code int} in the specified
//     *             {@code radix}, or if {@code radix} is either smaller than
//     *             {@link java.lang.Character#MIN_RADIX} or larger than
//     *             {@link java.lang.Character#MAX_RADIX}.
//     * @since  9
//     */
//    public static int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int radix)
//            throws NumberFormatException {
//        Objects.requireNonNull(s);
//
//        if (beginIndex < 0 || beginIndex > endIndex || endIndex > s.length()) {
//            throw new IndexOutOfBoundsException();
//        }
//        int start = beginIndex, len = endIndex - beginIndex;
//
//        if (len > 0) {
//            char firstChar = s.charAt(start);
//            if (firstChar == '-') {
//                throw new
//                        NumberFormatException(String.format("Illegal leading minus sign " +
//                        "on unsigned string %s.", s));
//            } else {
//                if (len <= 5 || // Integer.MAX_VALUE in Character.MAX_RADIX is 6 digits
//                        (radix == 10 && len <= 9)) { // Integer.MAX_VALUE in base 10 is 10 digits
//                    return parseInt(s, start, start + len, radix);
//                } else {
//                    long ell = Long.parseLong(s, start, start + len, radix);
//                    if ((ell & 0xffff_ffff_0000_0000L) == 0) {
//                        return (int) ell;
//                    } else {
//                        throw new
//                                NumberFormatException(String.format("String value %s exceeds " +
//                                "range of unsigned int.", s));
//                    }
//                }
//            }
//        } else {
//            throw new NumberFormatException("");
//        }
//    }
//
//    /**
//     * Parses the string argument as an unsigned decimal integer. The
//     * characters in the string must all be decimal digits, except
//     * that the first character may be an ASCII plus sign {@code
//     * '+'} ({@code '\u005Cu002B'}). The resulting integer value
//     * is returned, exactly as if the argument and the radix 10 were
//     * given as arguments to the {@link
//     * #parseUnsignedInt(java.lang.String, int)} method.
//     *
//     * @param s   a {@code String} containing the unsigned {@code int}
//     *            representation to be parsed
//     * @return    the unsigned integer value represented by the argument in decimal.
//     * @throws    NumberFormatException  if the string does not contain a
//     *            parsable unsigned integer.
//     * @since 1.8
//     */
//    public static int parseUnsignedInt(String s) throws NumberFormatException {
//        return parseUnsignedInt(s, 10);
//    }
//
//    /**
//     * Returns an {@code Integer} object holding the value
//     * extracted from the specified {@code String} when parsed
//     * with the radix given by the second argument. The first argument
//     * is interpreted as representing a signed integer in the radix
//     * specified by the second argument, exactly as if the arguments
//     * were given to the {@link #parseInt(java.lang.String, int)}
//     * method. The result is an {@code Integer} object that
//     * represents the integer value specified by the string.
//     *
//     * <p>In other words, this method returns an {@code Integer}
//     * object equal to the value of:
//     *
//     * <blockquote>
//     *  {@code new Integer(Integer.parseInt(s, radix))}
//     * </blockquote>
//     *
//     * @param      s   the string to be parsed.
//     * @param      radix the radix to be used in interpreting {@code s}
//     * @return     an {@code Integer} object holding the value
//     *             represented by the string argument in the specified
//     *             radix.
//     * @throws    NumberFormatException if the {@code String}
//     *            does not contain a parsable {@code int}.
//     */
//    public static java.lang.Integer valueOf(String s, int radix) throws NumberFormatException {
//        return java.lang.Integer.valueOf(parseInt(s,radix));
//    }
//
//    /**
//     * Returns an {@code Integer} object holding the
//     * value of the specified {@code String}. The argument is
//     * interpreted as representing a signed decimal integer, exactly
//     * as if the argument were given to the {@link
//     * #parseInt(java.lang.String)} method. The result is an
//     * {@code Integer} object that represents the integer value
//     * specified by the string.
//     *
//     * <p>In other words, this method returns an {@code Integer}
//     * object equal to the value of:
//     *
//     * <blockquote>
//     *  {@code new Integer(Integer.parseInt(s))}
//     * </blockquote>
//     *
//     * @param      s   the string to be parsed.
//     * @return     an {@code Integer} object holding the value
//     *             represented by the string argument.
//     * @throws     NumberFormatException  if the string cannot be parsed
//     *             as an integer.
//     */
//    public static java.lang.Integer valueOf(String s) throws NumberFormatException {
//        return java.lang.Integer.valueOf(parseInt(s, 10));
//    }
//
//    /**
//     * Cache to support the object identity semantics of autoboxing for values between
//     * -128 and 127 (inclusive) as required by JLS.
//     *
//     * The cache is initialized on first usage.  The size of the cache
//     * may be controlled by the {@code -XX:AutoBoxCacheMax=<size>} option.
//     * During VM initialization, java.lang.Integer.IntegerCache.high property
//     * may be set and saved in the private system properties in the
//     * jdk.internal.misc.VM class.
//     *
//     * WARNING: The cache is archived with CDS and reloaded from the shared
//     * archive at runtime. The archived cache (Integer[]) and Integer objects
//     * reside in the closed archive heap regions. Care should be taken when
//     * changing the implementation and the cache array should not be assigned
//     * with new Integer object(s) after initialization.
//     */
//
//    private static class IntegerCache {
//        static final int low = -128;
//        static final int high;
//        static final java.lang.Integer[] cache;
//        static java.lang.Integer[] archivedCache;
//
//        static {
//            // high value may be configured by property
//            int h = 127;
//            String integerCacheHighPropValue =
//                    VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
//            if (integerCacheHighPropValue != null) {
//                try {
//                    h = Math.max(parseInt(integerCacheHighPropValue), 127);
//                    // Maximum array size is Integer.MAX_VALUE
//                    h = Math.min(h, java.lang.Integer.MAX_VALUE - (-low) -1);
//                } catch( NumberFormatException nfe) {
//                    // If the property cannot be parsed into an int, ignore it.
//                }
//            }
//            high = h;
//
//            // Load IntegerCache.archivedCache from archive, if possible
//            CDS.initializeFromArchive(java.lang.Integer.IntegerCache.class);
//            int size = (high - low) + 1;
//
//            // Use the archived cache if it exists and is large enough
//            if (archivedCache == null || size > archivedCache.length) {
//                java.lang.Integer[] c = new java.lang.Integer[size];
//                int j = low;
//                for(int i = 0; i < c.length; i++) {
//                    c[i] = new java.lang.Integer(j++);
//                }
//                archivedCache = c;
//            }
//            cache = archivedCache;
//            // range [-128, 127] must be interned (JLS7 5.1.7)
//            assert java.lang.Integer.IntegerCache.high >= 127;
//        }
//
//        private IntegerCache() {}
//    }
//
//    /**
//     * Returns an {@code Integer} instance representing the specified
//     * {@code int} value.  If a new {@code Integer} instance is not
//     * required, this method should generally be used in preference to
//     * the constructor {@link #Integer(int)}, as this method is likely
//     * to yield significantly better space and time performance by
//     * caching frequently requested values.
//     *
//     * This method will always cache values in the range -128 to 127,
//     * inclusive, and may cache other values outside of this range.
//     *
//     * @param  i an {@code int} value.
//     * @return an {@code Integer} instance representing {@code i}.
//     * @since  1.5
//     */
//    @IntrinsicCandidate
//    public static java.lang.Integer valueOf(int i) {
//        if (i >= java.lang.Integer.IntegerCache.low && i <= java.lang.Integer.IntegerCache.high)
//            return java.lang.Integer.IntegerCache.cache[i + (-java.lang.Integer.IntegerCache.low)];
//        return new java.lang.Integer(i);
//    }
//
//    /**
//     * The value of the {@code Integer}.
//     *
//     * @serial
//     */
//    private final int value;
//
//    /**
//     * Constructs a newly allocated {@code Integer} object that
//     * represents the specified {@code int} value.
//     *
//     * @param   value   the value to be represented by the
//     *                  {@code Integer} object.
//     *
//     * @deprecated
//     * It is rarely appropriate to use this constructor. The static factory
//     * {@link #valueOf(int)} is generally a better choice, as it is
//     * likely to yield significantly better space and time performance.
//     */
//    @Deprecated(since="9", forRemoval = true)
//    public Integer(int value) {
//        this.value = value;
//    }
//
//    /**
//     * Constructs a newly allocated {@code Integer} object that
//     * represents the {@code int} value indicated by the
//     * {@code String} parameter. The string is converted to an
//     * {@code int} value in exactly the manner used by the
//     * {@code parseInt} method for radix 10.
//     *
//     * @param   s   the {@code String} to be converted to an {@code Integer}.
//     * @throws      NumberFormatException if the {@code String} does not
//     *              contain a parsable integer.
//     *
//     * @deprecated
//     * It is rarely appropriate to use this constructor.
//     * Use {@link #parseInt(String)} to convert a string to a
//     * {@code int} primitive, or use {@link #valueOf(String)}
//     * to convert a string to an {@code Integer} object.
//     */
//    @Deprecated(since="9", forRemoval = true)
//    public Integer(String s) throws NumberFormatException {
//        this.value = parseInt(s, 10);
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as a {@code byte}
//     * after a narrowing primitive conversion.
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     */
//    public byte byteValue() {
//        return (byte)value;
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as a {@code short}
//     * after a narrowing primitive conversion.
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     */
//    public short shortValue() {
//        return (short)value;
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as an
//     * {@code int}.
//     */
//    @IntrinsicCandidate
//    public int intValue() {
//        return value;
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as a {@code long}
//     * after a widening primitive conversion.
//     * @jls 5.1.2 Widening Primitive Conversion
//     * @see java.lang.Integer#toUnsignedLong(int)
//     */
//    public long longValue() {
//        return (long)value;
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as a {@code float}
//     * after a widening primitive conversion.
//     * @jls 5.1.2 Widening Primitive Conversion
//     */
//    public float floatValue() {
//        return (float)value;
//    }
//
//    /**
//     * Returns the value of this {@code Integer} as a {@code double}
//     * after a widening primitive conversion.
//     * @jls 5.1.2 Widening Primitive Conversion
//     */
//    public double doubleValue() {
//        return (double)value;
//    }
//
//    /**
//     * Returns a {@code String} object representing this
//     * {@code Integer}'s value. The value is converted to signed
//     * decimal representation and returned as a string, exactly as if
//     * the integer value were given as an argument to the {@link
//     * java.lang.Integer#toString(int)} method.
//     *
//     * @return  a string representation of the value of this object in
//     *          base&nbsp;10.
//     */
//    public String toString() {
//        return toString(value);
//    }
//
//    /**
//     * Returns a hash code for this {@code Integer}.
//     *
//     * @return  a hash code value for this object, equal to the
//     *          primitive {@code int} value represented by this
//     *          {@code Integer} object.
//     */
//    @Override
//    public int hashCode() {
//        return java.lang.Integer.hashCode(value);
//    }
//
//    /**
//     * Returns a hash code for an {@code int} value; compatible with
//     * {@code Integer.hashCode()}.
//     *
//     * @param value the value to hash
//     * @since 1.8
//     *
//     * @return a hash code value for an {@code int} value.
//     */
//    public static int hashCode(int value) {
//        return value;
//    }
//
//    /**
//     * Compares this object to the specified object.  The result is
//     * {@code true} if and only if the argument is not
//     * {@code null} and is an {@code Integer} object that
//     * contains the same {@code int} value as this object.
//     *
//     * @param   obj   the object to compare with.
//     * @return  {@code true} if the objects are the same;
//     *          {@code false} otherwise.
//     */
//    public boolean equals(Object obj) {
//        if (obj instanceof java.lang.Integer) {
//            return value == ((java.lang.Integer)obj).intValue();
//        }
//        return false;
//    }
//
//    /**
//     * Determines the integer value of the system property with the
//     * specified name.
//     *
//     * <p>The first argument is treated as the name of a system
//     * property.  System properties are accessible through the {@link
//     * java.lang.System#getProperty(java.lang.String)} method. The
//     * string value of this property is then interpreted as an integer
//     * value using the grammar supported by {@link java.lang.Integer#decode decode} and
//     * an {@code Integer} object representing this value is returned.
//     *
//     * <p>If there is no property with the specified name, if the
//     * specified name is empty or {@code null}, or if the property
//     * does not have the correct numeric format, then {@code null} is
//     * returned.
//     *
//     * <p>In other words, this method returns an {@code Integer}
//     * object equal to the value of:
//     *
//     * <blockquote>
//     *  {@code getInteger(nm, null)}
//     * </blockquote>
//     *
//     * @param   nm   property name.
//     * @return  the {@code Integer} value of the property.
//     * @throws  SecurityException for the same reasons as
//     *          {@link System#getProperty(String) System.getProperty}
//     * @see     java.lang.System#getProperty(java.lang.String)
//     * @see     java.lang.System#getProperty(java.lang.String, java.lang.String)
//     */
//    public static java.lang.Integer getInteger(String nm) {
//        return getInteger(nm, null);
//    }
//
//    /**
//     * Determines the integer value of the system property with the
//     * specified name.
//     *
//     * <p>The first argument is treated as the name of a system
//     * property.  System properties are accessible through the {@link
//     * java.lang.System#getProperty(java.lang.String)} method. The
//     * string value of this property is then interpreted as an integer
//     * value using the grammar supported by {@link java.lang.Integer#decode decode} and
//     * an {@code Integer} object representing this value is returned.
//     *
//     * <p>The second argument is the default value. An {@code Integer} object
//     * that represents the value of the second argument is returned if there
//     * is no property of the specified name, if the property does not have
//     * the correct numeric format, or if the specified name is empty or
//     * {@code null}.
//     *
//     * <p>In other words, this method returns an {@code Integer} object
//     * equal to the value of:
//     *
//     * <blockquote>
//     *  {@code getInteger(nm, new Integer(val))}
//     * </blockquote>
//     *
//     * but in practice it may be implemented in a manner such as:
//     *
//     * <blockquote><pre>
//     * Integer result = getInteger(nm, null);
//     * return (result == null) ? new Integer(val) : result;
//     * </pre></blockquote>
//     *
//     * to avoid the unnecessary allocation of an {@code Integer}
//     * object when the default value is not needed.
//     *
//     * @param   nm   property name.
//     * @param   val   default value.
//     * @return  the {@code Integer} value of the property.
//     * @throws  SecurityException for the same reasons as
//     *          {@link System#getProperty(String) System.getProperty}
//     * @see     java.lang.System#getProperty(java.lang.String)
//     * @see     java.lang.System#getProperty(java.lang.String, java.lang.String)
//     */
//    public static java.lang.Integer getInteger(String nm, int val) {
//        java.lang.Integer result = getInteger(nm, null);
//        return (result == null) ? java.lang.Integer.valueOf(val) : result;
//    }
//
//    /**
//     * Returns the integer value of the system property with the
//     * specified name.  The first argument is treated as the name of a
//     * system property.  System properties are accessible through the
//     * {@link java.lang.System#getProperty(java.lang.String)} method.
//     * The string value of this property is then interpreted as an
//     * integer value, as per the {@link java.lang.Integer#decode decode} method,
//     * and an {@code Integer} object representing this value is
//     * returned; in summary:
//     *
//     * <ul><li>If the property value begins with the two ASCII characters
//     *         {@code 0x} or the ASCII character {@code #}, not
//     *      followed by a minus sign, then the rest of it is parsed as a
//     *      hexadecimal integer exactly as by the method
//     *      {@link #valueOf(java.lang.String, int)} with radix 16.
//     * <li>If the property value begins with the ASCII character
//     *     {@code 0} followed by another character, it is parsed as an
//     *     octal integer exactly as by the method
//     *     {@link #valueOf(java.lang.String, int)} with radix 8.
//     * <li>Otherwise, the property value is parsed as a decimal integer
//     * exactly as by the method {@link #valueOf(java.lang.String, int)}
//     * with radix 10.
//     * </ul>
//     *
//     * <p>The second argument is the default value. The default value is
//     * returned if there is no property of the specified name, if the
//     * property does not have the correct numeric format, or if the
//     * specified name is empty or {@code null}.
//     *
//     * @param   nm   property name.
//     * @param   val   default value.
//     * @return  the {@code Integer} value of the property.
//     * @throws  SecurityException for the same reasons as
//     *          {@link System#getProperty(String) System.getProperty}
//     * @see     System#getProperty(java.lang.String)
//     * @see     System#getProperty(java.lang.String, java.lang.String)
//     */
//    public static java.lang.Integer getInteger(String nm, java.lang.Integer val) {
//        String v = null;
//        try {
//            v = System.getProperty(nm);
//        } catch (IllegalArgumentException | NullPointerException e) {
//        }
//        if (v != null) {
//            try {
//                return java.lang.Integer.decode(v);
//            } catch (NumberFormatException e) {
//            }
//        }
//        return val;
//    }
//
//    /**
//     * Decodes a {@code String} into an {@code Integer}.
//     * Accepts decimal, hexadecimal, and octal numbers given
//     * by the following grammar:
//     *
//     * <blockquote>
//     * <dl>
//     * <dt><i>DecodableString:</i>
//     * <dd><i>Sign<sub>opt</sub> DecimalNumeral</i>
//     * <dd><i>Sign<sub>opt</sub></i> {@code 0x} <i>HexDigits</i>
//     * <dd><i>Sign<sub>opt</sub></i> {@code 0X} <i>HexDigits</i>
//     * <dd><i>Sign<sub>opt</sub></i> {@code #} <i>HexDigits</i>
//     * <dd><i>Sign<sub>opt</sub></i> {@code 0} <i>OctalDigits</i>
//     *
//     * <dt><i>Sign:</i>
//     * <dd>{@code -}
//     * <dd>{@code +}
//     * </dl>
//     * </blockquote>
//     *
//     * <i>DecimalNumeral</i>, <i>HexDigits</i>, and <i>OctalDigits</i>
//     * are as defined in section {@jls 3.10.1} of
//     * <cite>The Java Language Specification</cite>,
//     * except that underscores are not accepted between digits.
//     *
//     * <p>The sequence of characters following an optional
//     * sign and/or radix specifier ("{@code 0x}", "{@code 0X}",
//     * "{@code #}", or leading zero) is parsed as by the {@code
//     * Integer.parseInt} method with the indicated radix (10, 16, or
//     * 8).  This sequence of characters must represent a positive
//     * value or a {@link NumberFormatException} will be thrown.  The
//     * result is negated if first character of the specified {@code
//     * String} is the minus sign.  No whitespace characters are
//     * permitted in the {@code String}.
//     *
//     * @param     nm the {@code String} to decode.
//     * @return    an {@code Integer} object holding the {@code int}
//     *             value represented by {@code nm}
//     * @throws    NumberFormatException  if the {@code String} does not
//     *            contain a parsable integer.
//     * @see java.lang.Integer#parseInt(java.lang.String, int)
//     */
//    public static java.lang.Integer decode(String nm) throws NumberFormatException {
//        int radix = 10;
//        int index = 0;
//        boolean negative = false;
//        java.lang.Integer result;
//
//        if (nm.isEmpty())
//            throw new NumberFormatException("Zero length string");
//        char firstChar = nm.charAt(0);
//        // Handle sign, if present
//        if (firstChar == '-') {
//            negative = true;
//            index++;
//        } else if (firstChar == '+')
//            index++;
//
//        // Handle radix specifier, if present
//        if (nm.startsWith("0x", index) || nm.startsWith("0X", index)) {
//            index += 2;
//            radix = 16;
//        }
//        else if (nm.startsWith("#", index)) {
//            index ++;
//            radix = 16;
//        }
//        else if (nm.startsWith("0", index) && nm.length() > 1 + index) {
//            index ++;
//            radix = 8;
//        }
//
//        if (nm.startsWith("-", index) || nm.startsWith("+", index))
//            throw new NumberFormatException("Sign character in wrong position");
//
//        try {
//            result = java.lang.Integer.valueOf(nm.substring(index), radix);
//            result = negative ? java.lang.Integer.valueOf(-result.intValue()) : result;
//        } catch (NumberFormatException e) {
//            // If number is Integer.MIN_VALUE, we'll end up here. The next line
//            // handles this case, and causes any genuine format error to be
//            // rethrown.
//            String constant = negative ? ("-" + nm.substring(index))
//                    : nm.substring(index);
//            result = java.lang.Integer.valueOf(constant, radix);
//        }
//        return result;
//    }
//
//    /**
//     * Compares two {@code Integer} objects numerically.
//     *
//     * @param   anotherInteger   the {@code Integer} to be compared.
//     * @return  the value {@code 0} if this {@code Integer} is
//     *          equal to the argument {@code Integer}; a value less than
//     *          {@code 0} if this {@code Integer} is numerically less
//     *          than the argument {@code Integer}; and a value greater
//     *          than {@code 0} if this {@code Integer} is numerically
//     *           greater than the argument {@code Integer} (signed
//     *           comparison).
//     * @since   1.2
//     */
//    public int compareTo(java.lang.Integer anotherInteger) {
//        return compare(this.value, anotherInteger.value);
//    }
//
//    /**
//     * Compares two {@code int} values numerically.
//     * The value returned is identical to what would be returned by:
//     * <pre>
//     *    Integer.valueOf(x).compareTo(Integer.valueOf(y))
//     * </pre>
//     *
//     * @param  x the first {@code int} to compare
//     * @param  y the second {@code int} to compare
//     * @return the value {@code 0} if {@code x == y};
//     *         a value less than {@code 0} if {@code x < y}; and
//     *         a value greater than {@code 0} if {@code x > y}
//     * @since 1.7
//     */
//    public static int compare(int x, int y) {
//        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//    }
//
//    /**
//     * Compares two {@code int} values numerically treating the values
//     * as unsigned.
//     *
//     * @param  x the first {@code int} to compare
//     * @param  y the second {@code int} to compare
//     * @return the value {@code 0} if {@code x == y}; a value less
//     *         than {@code 0} if {@code x < y} as unsigned values; and
//     *         a value greater than {@code 0} if {@code x > y} as
//     *         unsigned values
//     * @since 1.8
//     */
//    public static int compareUnsigned(int x, int y) {
//        return compare(x + MIN_VALUE, y + MIN_VALUE);
//    }
//
//    /**
//     * Converts the argument to a {@code long} by an unsigned
//     * conversion.  In an unsigned conversion to a {@code long}, the
//     * high-order 32 bits of the {@code long} are zero and the
//     * low-order 32 bits are equal to the bits of the integer
//     * argument.
//     *
//     * Consequently, zero and positive {@code int} values are mapped
//     * to a numerically equal {@code long} value and negative {@code
//     * int} values are mapped to a {@code long} value equal to the
//     * input plus 2<sup>32</sup>.
//     *
//     * @param  x the value to convert to an unsigned {@code long}
//     * @return the argument converted to {@code long} by an unsigned
//     *         conversion
//     * @since 1.8
//     */
//    public static long toUnsignedLong(int x) {
//        return ((long) x) & 0xffffffffL;
//    }
//
//    /**
//     * Returns the unsigned quotient of dividing the first argument by
//     * the second where each argument and the result is interpreted as
//     * an unsigned value.
//     *
//     * <p>Note that in two's complement arithmetic, the three other
//     * basic arithmetic operations of add, subtract, and multiply are
//     * bit-wise identical if the two operands are regarded as both
//     * being signed or both being unsigned.  Therefore separate {@code
//     * addUnsigned}, etc. methods are not provided.
//     *
//     * @param dividend the value to be divided
//     * @param divisor the value doing the dividing
//     * @return the unsigned quotient of the first argument divided by
//     * the second argument
//     * @see #remainderUnsigned
//     * @since 1.8
//     */
//    public static int divideUnsigned(int dividend, int divisor) {
//        // In lieu of tricky code, for now just use long arithmetic.
//        return (int)(toUnsignedLong(dividend) / toUnsignedLong(divisor));
//    }
//
//    /**
//     * Returns the unsigned remainder from dividing the first argument
//     * by the second where each argument and the result is interpreted
//     * as an unsigned value.
//     *
//     * @param dividend the value to be divided
//     * @param divisor the value doing the dividing
//     * @return the unsigned remainder of the first argument divided by
//     * the second argument
//     * @see #divideUnsigned
//     * @since 1.8
//     */
//    public static int remainderUnsigned(int dividend, int divisor) {
//        // In lieu of tricky code, for now just use long arithmetic.
//        return (int)(toUnsignedLong(dividend) % toUnsignedLong(divisor));
//    }
//
//
//    // Bit twiddling
//
//    /**
//     * The number of bits used to represent an {@code int} value in two's
//     * complement binary form.
//     *
//     * @since 1.5
//     */
//    @Native public static final int SIZE = 32;
//
//    /**
//     * The number of bytes used to represent an {@code int} value in two's
//     * complement binary form.
//     *
//     * @since 1.8
//     */
//    public static final int BYTES = SIZE / Byte.SIZE;
//
//    /**
//     * Returns an {@code int} value with at most a single one-bit, in the
//     * position of the highest-order ("leftmost") one-bit in the specified
//     * {@code int} value.  Returns zero if the specified value has no
//     * one-bits in its two's complement binary representation, that is, if it
//     * is equal to zero.
//     *
//     * @param i the value whose highest one bit is to be computed
//     * @return an {@code int} value with a single one-bit, in the position
//     *     of the highest-order one-bit in the specified value, or zero if
//     *     the specified value is itself equal to zero.
//     * @since 1.5
//     */
//    public static int highestOneBit(int i) {
//        return i & (MIN_VALUE >>> numberOfLeadingZeros(i));
//    }
//
//    /**
//     * Returns an {@code int} value with at most a single one-bit, in the
//     * position of the lowest-order ("rightmost") one-bit in the specified
//     * {@code int} value.  Returns zero if the specified value has no
//     * one-bits in its two's complement binary representation, that is, if it
//     * is equal to zero.
//     *
//     * @param i the value whose lowest one bit is to be computed
//     * @return an {@code int} value with a single one-bit, in the position
//     *     of the lowest-order one-bit in the specified value, or zero if
//     *     the specified value is itself equal to zero.
//     * @since 1.5
//     */
//    public static int lowestOneBit(int i) {
//        // HD, Section 2-1
//        return i & -i;
//    }
//
//    /**
//     * Returns the number of zero bits preceding the highest-order
//     * ("leftmost") one-bit in the two's complement binary representation
//     * of the specified {@code int} value.  Returns 32 if the
//     * specified value has no one-bits in its two's complement representation,
//     * in other words if it is equal to zero.
//     *
//     * <p>Note that this method is closely related to the logarithm base 2.
//     * For all positive {@code int} values x:
//     * <ul>
//     * <li>floor(log<sub>2</sub>(x)) = {@code 31 - numberOfLeadingZeros(x)}
//     * <li>ceil(log<sub>2</sub>(x)) = {@code 32 - numberOfLeadingZeros(x - 1)}
//     * </ul>
//     *
//     * @param i the value whose number of leading zeros is to be computed
//     * @return the number of zero bits preceding the highest-order
//     *     ("leftmost") one-bit in the two's complement binary representation
//     *     of the specified {@code int} value, or 32 if the value
//     *     is equal to zero.
//     * @since 1.5
//     */
//    @IntrinsicCandidate
//    public static int numberOfLeadingZeros(int i) {
//        // HD, Count leading 0's
//        if (i <= 0)
//            return i == 0 ? 32 : 0;
//        int n = 31;
//        if (i >= 1 << 16) { n -= 16; i >>>= 16; }
//        if (i >= 1 <<  8) { n -=  8; i >>>=  8; }
//        if (i >= 1 <<  4) { n -=  4; i >>>=  4; }
//        if (i >= 1 <<  2) { n -=  2; i >>>=  2; }
//        return n - (i >>> 1);
//    }
//
//    /**
//     * Returns the number of zero bits following the lowest-order ("rightmost")
//     * one-bit in the two's complement binary representation of the specified
//     * {@code int} value.  Returns 32 if the specified value has no
//     * one-bits in its two's complement representation, in other words if it is
//     * equal to zero.
//     *
//     * @param i the value whose number of trailing zeros is to be computed
//     * @return the number of zero bits following the lowest-order ("rightmost")
//     *     one-bit in the two's complement binary representation of the
//     *     specified {@code int} value, or 32 if the value is equal
//     *     to zero.
//     * @since 1.5
//     */
//    @IntrinsicCandidate
//    public static int numberOfTrailingZeros(int i) {
//        // HD, Count trailing 0's
//        i = ~i & (i - 1);
//        if (i <= 0) return i & 32;
//        int n = 1;
//        if (i > 1 << 16) { n += 16; i >>>= 16; }
//        if (i > 1 <<  8) { n +=  8; i >>>=  8; }
//        if (i > 1 <<  4) { n +=  4; i >>>=  4; }
//        if (i > 1 <<  2) { n +=  2; i >>>=  2; }
//        return n + (i >>> 1);
//    }
//
//    /**
//     * Returns the number of one-bits in the two's complement binary
//     * representation of the specified {@code int} value.  This function is
//     * sometimes referred to as the <i>population count</i>.
//     *
//     * @param i the value whose bits are to be counted
//     * @return the number of one-bits in the two's complement binary
//     *     representation of the specified {@code int} value.
//     * @since 1.5
//     */
//    @IntrinsicCandidate
//    public static int bitCount(int i) {
//        // HD, Figure 5-2
//        i = i - ((i >>> 1) & 0x55555555);
//        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
//        i = (i + (i >>> 4)) & 0x0f0f0f0f;
//        i = i + (i >>> 8);
//        i = i + (i >>> 16);
//        return i & 0x3f;
//    }
//
//    /**
//     * Returns the value obtained by rotating the two's complement binary
//     * representation of the specified {@code int} value left by the
//     * specified number of bits.  (Bits shifted out of the left hand, or
//     * high-order, side reenter on the right, or low-order.)
//     *
//     * <p>Note that left rotation with a negative distance is equivalent to
//     * right rotation: {@code rotateLeft(val, -distance) == rotateRight(val,
//     * distance)}.  Note also that rotation by any multiple of 32 is a
//     * no-op, so all but the last five bits of the rotation distance can be
//     * ignored, even if the distance is negative: {@code rotateLeft(val,
//     * distance) == rotateLeft(val, distance & 0x1F)}.
//     *
//     * @param i the value whose bits are to be rotated left
//     * @param distance the number of bit positions to rotate left
//     * @return the value obtained by rotating the two's complement binary
//     *     representation of the specified {@code int} value left by the
//     *     specified number of bits.
//     * @since 1.5
//     */
//    public static int rotateLeft(int i, int distance) {
//        return (i << distance) | (i >>> -distance);
//    }
//
//    /**
//     * Returns the value obtained by rotating the two's complement binary
//     * representation of the specified {@code int} value right by the
//     * specified number of bits.  (Bits shifted out of the right hand, or
//     * low-order, side reenter on the left, or high-order.)
//     *
//     * <p>Note that right rotation with a negative distance is equivalent to
//     * left rotation: {@code rotateRight(val, -distance) == rotateLeft(val,
//     * distance)}.  Note also that rotation by any multiple of 32 is a
//     * no-op, so all but the last five bits of the rotation distance can be
//     * ignored, even if the distance is negative: {@code rotateRight(val,
//     * distance) == rotateRight(val, distance & 0x1F)}.
//     *
//     * @param i the value whose bits are to be rotated right
//     * @param distance the number of bit positions to rotate right
//     * @return the value obtained by rotating the two's complement binary
//     *     representation of the specified {@code int} value right by the
//     *     specified number of bits.
//     * @since 1.5
//     */
//    public static int rotateRight(int i, int distance) {
//        return (i >>> distance) | (i << -distance);
//    }
//
//    /**
//     * Returns the value obtained by reversing the order of the bits in the
//     * two's complement binary representation of the specified {@code int}
//     * value.
//     *
//     * @param i the value to be reversed
//     * @return the value obtained by reversing order of the bits in the
//     *     specified {@code int} value.
//     * @since 1.5
//     */
//    public static int reverse(int i) {
//        // HD, Figure 7-1
//        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
//        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
//        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
//
//        return reverseBytes(i);
//    }
//
//    /**
//     * Returns the signum function of the specified {@code int} value.  (The
//     * return value is -1 if the specified value is negative; 0 if the
//     * specified value is zero; and 1 if the specified value is positive.)
//     *
//     * @param i the value whose signum is to be computed
//     * @return the signum function of the specified {@code int} value.
//     * @since 1.5
//     */
//    public static int signum(int i) {
//        // HD, Section 2-7
//        return (i >> 31) | (-i >>> 31);
//    }
//
//    /**
//     * Returns the value obtained by reversing the order of the bytes in the
//     * two's complement representation of the specified {@code int} value.
//     *
//     * @param i the value whose bytes are to be reversed
//     * @return the value obtained by reversing the bytes in the specified
//     *     {@code int} value.
//     * @since 1.5
//     */
//    @IntrinsicCandidate
//    public static int reverseBytes(int i) {
//        return (i << 24)            |
//                ((i & 0xff00) << 8)  |
//                ((i >>> 8) & 0xff00) |
//                (i >>> 24);
//    }
//
//    /**
//     * Adds two integers together as per the + operator.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the sum of {@code a} and {@code b}
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    /**
//     * Returns the greater of two {@code int} values
//     * as if by calling {@link Math#max(int, int) Math.max}.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the greater of {@code a} and {@code b}
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static int max(int a, int b) {
//        return Math.max(a, b);
//    }
//
//    /**
//     * Returns the smaller of two {@code int} values
//     * as if by calling {@link Math#min(int, int) Math.min}.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the smaller of {@code a} and {@code b}
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static int min(int a, int b) {
//        return Math.min(a, b);
//    }
//
//    /**
//     * Returns an {@link Optional} containing the nominal descriptor for this
//     * instance, which is the instance itself.
//     *
//     * @return an {@link Optional} describing the {@linkplain java.lang.Integer} instance
//     * @since 12
//     */
//    @Override
//    public Optional<java.lang.Integer> describeConstable() {
//        return Optional.of(this);
//    }
//
//    /**
//     * Resolves this instance as a {@link ConstantDesc}, the result of which is
//     * the instance itself.
//     *
//     * @param lookup ignored
//     * @return the {@linkplain java.lang.Integer} instance
//     * @since 12
//     */
//    @Override
//    public java.lang.Integer resolveConstantDesc(MethodHandles.Lookup lookup) {
//        return this;
//    }
//
//    /** use serialVersionUID from JDK 1.0.2 for interoperability */
//    @java.io.Serial
//    @Native private static final long serialVersionUID = 1360826667806852920L;
//}


///*
// * Copyright (c) 1994, 2020, Oracle and/or its affiliates. All rights reserved.
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
// *
// * This code is free software; you can redistribute it and/or modify it
// * under the terms of the GNU General Public License version 2 only, as
// * published by the Free Software Foundation.  Oracle designates this
// * particular file as subject to the "Classpath" exception as provided
// * by Oracle in the LICENSE file that accompanied this code.
// *
// * This code is distributed in the hope that it will be useful, but WITHOUT
// * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
// * version 2 for more details (a copy is included in the LICENSE file that
// * accompanied this code).
// *
// * You should have received a copy of the GNU General Public License version
// * 2 along with this work; if not, write to the Free Software Foundation,
// * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
// *
// * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
// * or visit www.oracle.com if you need additional information or have any
// * questions.
// */
//
//package java.lang;
//
//        import java.lang.invoke.MethodHandles;
//        import java.lang.constant.Constable;
//        import java.lang.constant.ConstantDesc;
//        import java.util.Optional;
//
//        import jdk.internal.math.FloatingDecimal;
//        import jdk.internal.math.DoubleConsts;
//        import jdk.internal.vm.annotation.IntrinsicCandidate;
//
///**
// * The {@code Double} class wraps a value of the primitive type
// * {@code double} in an object. An object of type
// * {@code Double} contains a single field whose type is
// * {@code double}.
// *
// * <p>In addition, this class provides several methods for converting a
// * {@code double} to a {@code String} and a
// * {@code String} to a {@code double}, as well as other
// * constants and methods useful when dealing with a
// * {@code double}.
// *
// * <p>This is a <a href="{@docRoot}/java.base/java/lang/doc-files/ValueBased.html">value-based</a>
// * class; programmers should treat instances that are
// * {@linkplain #equals(Object) equal} as interchangeable and should not
// * use instances for synchronization, or unpredictable behavior may
// * occur. For example, in a future release, synchronization may fail.
// *
// * @author  Lee Boynton
// * @author  Arthur van Hoff
// * @author  Joseph D. Darcy
// * @since 1.0
// */
//@jdk.internal.ValueBased
//public final class Double extends Number
//        implements Comparable<java.lang.Double>, Constable, ConstantDesc {
//    /**
//     * A constant holding the positive infinity of type
//     * {@code double}. It is equal to the value returned by
//     * {@code Double.longBitsToDouble(0x7ff0000000000000L)}.
//     */
//    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
//
//    /**
//     * A constant holding the negative infinity of type
//     * {@code double}. It is equal to the value returned by
//     * {@code Double.longBitsToDouble(0xfff0000000000000L)}.
//     */
//    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
//
//    /**
//     * A constant holding a Not-a-Number (NaN) value of type
//     * {@code double}. It is equivalent to the value returned by
//     * {@code Double.longBitsToDouble(0x7ff8000000000000L)}.
//     */
//    public static final double NaN = 0.0d / 0.0;
//
//    /**
//     * A constant holding the largest positive finite value of type
//     * {@code double},
//     * (2-2<sup>-52</sup>)&middot;2<sup>1023</sup>.  It is equal to
//     * the hexadecimal floating-point literal
//     * {@code 0x1.fffffffffffffP+1023} and also equal to
//     * {@code Double.longBitsToDouble(0x7fefffffffffffffL)}.
//     */
//    public static final double MAX_VALUE = 0x1.fffffffffffffP+1023; // 1.7976931348623157e+308
//
//    /**
//     * A constant holding the smallest positive normal value of type
//     * {@code double}, 2<sup>-1022</sup>.  It is equal to the
//     * hexadecimal floating-point literal {@code 0x1.0p-1022} and also
//     * equal to {@code Double.longBitsToDouble(0x0010000000000000L)}.
//     *
//     * @since 1.6
//     */
//    public static final double MIN_NORMAL = 0x1.0p-1022; // 2.2250738585072014E-308
//
//    /**
//     * A constant holding the smallest positive nonzero value of type
//     * {@code double}, 2<sup>-1074</sup>. It is equal to the
//     * hexadecimal floating-point literal
//     * {@code 0x0.0000000000001P-1022} and also equal to
//     * {@code Double.longBitsToDouble(0x1L)}.
//     */
//    public static final double MIN_VALUE = 0x0.0000000000001P-1022; // 4.9e-324
//
//    /**
//     * Maximum exponent a finite {@code double} variable may have.
//     * It is equal to the value returned by
//     * {@code Math.getExponent(Double.MAX_VALUE)}.
//     *
//     * @since 1.6
//     */
//    public static final int MAX_EXPONENT = 1023;
//
//    /**
//     * Minimum exponent a normalized {@code double} variable may
//     * have.  It is equal to the value returned by
//     * {@code Math.getExponent(Double.MIN_NORMAL)}.
//     *
//     * @since 1.6
//     */
//    public static final int MIN_EXPONENT = -1022;
//
//    /**
//     * The number of bits used to represent a {@code double} value.
//     *
//     * @since 1.5
//     */
//    public static final int SIZE = 64;
//
//    /**
//     * The number of bytes used to represent a {@code double} value.
//     *
//     * @since 1.8
//     */
//    public static final int BYTES = SIZE / Byte.SIZE;
//
//    /**
//     * The {@code Class} instance representing the primitive type
//     * {@code double}.
//     *
//     * @since 1.1
//     */
//    @SuppressWarnings("unchecked")
//    public static final Class<java.lang.Double>   TYPE = (Class<java.lang.Double>) Class.getPrimitiveClass("double");
//
//    /**
//     * Returns a string representation of the {@code double}
//     * argument. All characters mentioned below are ASCII characters.
//     * <ul>
//     * <li>If the argument is NaN, the result is the string
//     *     "{@code NaN}".
//     * <li>Otherwise, the result is a string that represents the sign and
//     * magnitude (absolute value) of the argument. If the sign is negative,
//     * the first character of the result is '{@code -}'
//     * ({@code '\u005Cu002D'}); if the sign is positive, no sign character
//     * appears in the result. As for the magnitude <i>m</i>:
//     * <ul>
//     * <li>If <i>m</i> is infinity, it is represented by the characters
//     * {@code "Infinity"}; thus, positive infinity produces the result
//     * {@code "Infinity"} and negative infinity produces the result
//     * {@code "-Infinity"}.
//     *
//     * <li>If <i>m</i> is zero, it is represented by the characters
//     * {@code "0.0"}; thus, negative zero produces the result
//     * {@code "-0.0"} and positive zero produces the result
//     * {@code "0.0"}.
//     *
//     * <li>If <i>m</i> is greater than or equal to 10<sup>-3</sup> but less
//     * than 10<sup>7</sup>, then it is represented as the integer part of
//     * <i>m</i>, in decimal form with no leading zeroes, followed by
//     * '{@code .}' ({@code '\u005Cu002E'}), followed by one or
//     * more decimal digits representing the fractional part of <i>m</i>.
//     *
//     * <li>If <i>m</i> is less than 10<sup>-3</sup> or greater than or
//     * equal to 10<sup>7</sup>, then it is represented in so-called
//     * "computerized scientific notation." Let <i>n</i> be the unique
//     * integer such that 10<sup><i>n</i></sup> &le; <i>m</i> {@literal <}
//     * 10<sup><i>n</i>+1</sup>; then let <i>a</i> be the
//     * mathematically exact quotient of <i>m</i> and
//     * 10<sup><i>n</i></sup> so that 1 &le; <i>a</i> {@literal <} 10. The
//     * magnitude is then represented as the integer part of <i>a</i>,
//     * as a single decimal digit, followed by '{@code .}'
//     * ({@code '\u005Cu002E'}), followed by decimal digits
//     * representing the fractional part of <i>a</i>, followed by the
//     * letter '{@code E}' ({@code '\u005Cu0045'}), followed
//     * by a representation of <i>n</i> as a decimal integer, as
//     * produced by the method {@link Integer#toString(int)}.
//     * </ul>
//     * </ul>
//     * How many digits must be printed for the fractional part of
//     * <i>m</i> or <i>a</i>? There must be at least one digit to represent
//     * the fractional part, and beyond that as many, but only as many, more
//     * digits as are needed to uniquely distinguish the argument value from
//     * adjacent values of type {@code double}. That is, suppose that
//     * <i>x</i> is the exact mathematical value represented by the decimal
//     * representation produced by this method for a finite nonzero argument
//     * <i>d</i>. Then <i>d</i> must be the {@code double} value nearest
//     * to <i>x</i>; or if two {@code double} values are equally close
//     * to <i>x</i>, then <i>d</i> must be one of them and the least
//     * significant bit of the significand of <i>d</i> must be {@code 0}.
//     *
//     * <p>To create localized string representations of a floating-point
//     * value, use subclasses of {@link java.text.NumberFormat}.
//     *
//     * @param   d   the {@code double} to be converted.
//     * @return a string representation of the argument.
//     */
//    public static String toString(double d) {
//        return FloatingDecimal.toJavaFormatString(d);
//    }
//
//    /**
//     * Returns a hexadecimal string representation of the
//     * {@code double} argument. All characters mentioned below
//     * are ASCII characters.
//     *
//     * <ul>
//     * <li>If the argument is NaN, the result is the string
//     *     "{@code NaN}".
//     * <li>Otherwise, the result is a string that represents the sign
//     * and magnitude of the argument. If the sign is negative, the
//     * first character of the result is '{@code -}'
//     * ({@code '\u005Cu002D'}); if the sign is positive, no sign
//     * character appears in the result. As for the magnitude <i>m</i>:
//     *
//     * <ul>
//     * <li>If <i>m</i> is infinity, it is represented by the string
//     * {@code "Infinity"}; thus, positive infinity produces the
//     * result {@code "Infinity"} and negative infinity produces
//     * the result {@code "-Infinity"}.
//     *
//     * <li>If <i>m</i> is zero, it is represented by the string
//     * {@code "0x0.0p0"}; thus, negative zero produces the result
//     * {@code "-0x0.0p0"} and positive zero produces the result
//     * {@code "0x0.0p0"}.
//     *
//     * <li>If <i>m</i> is a {@code double} value with a
//     * normalized representation, substrings are used to represent the
//     * significand and exponent fields.  The significand is
//     * represented by the characters {@code "0x1."}
//     * followed by a lowercase hexadecimal representation of the rest
//     * of the significand as a fraction.  Trailing zeros in the
//     * hexadecimal representation are removed unless all the digits
//     * are zero, in which case a single zero is used. Next, the
//     * exponent is represented by {@code "p"} followed
//     * by a decimal string of the unbiased exponent as if produced by
//     * a call to {@link Integer#toString(int) Integer.toString} on the
//     * exponent value.
//     *
//     * <li>If <i>m</i> is a {@code double} value with a subnormal
//     * representation, the significand is represented by the
//     * characters {@code "0x0."} followed by a
//     * hexadecimal representation of the rest of the significand as a
//     * fraction.  Trailing zeros in the hexadecimal representation are
//     * removed. Next, the exponent is represented by
//     * {@code "p-1022"}.  Note that there must be at
//     * least one nonzero digit in a subnormal significand.
//     *
//     * </ul>
//     *
//     * </ul>
//     *
//     * <table class="striped">
//     * <caption>Examples</caption>
//     * <thead>
//     * <tr><th scope="col">Floating-point Value</th><th scope="col">Hexadecimal String</th>
//     * </thead>
//     * <tbody style="text-align:right">
//     * <tr><th scope="row">{@code 1.0}</th> <td>{@code 0x1.0p0}</td>
//     * <tr><th scope="row">{@code -1.0}</th>        <td>{@code -0x1.0p0}</td>
//     * <tr><th scope="row">{@code 2.0}</th> <td>{@code 0x1.0p1}</td>
//     * <tr><th scope="row">{@code 3.0}</th> <td>{@code 0x1.8p1}</td>
//     * <tr><th scope="row">{@code 0.5}</th> <td>{@code 0x1.0p-1}</td>
//     * <tr><th scope="row">{@code 0.25}</th>        <td>{@code 0x1.0p-2}</td>
//     * <tr><th scope="row">{@code Double.MAX_VALUE}</th>
//     *     <td>{@code 0x1.fffffffffffffp1023}</td>
//     * <tr><th scope="row">{@code Minimum Normal Value}</th>
//     *     <td>{@code 0x1.0p-1022}</td>
//     * <tr><th scope="row">{@code Maximum Subnormal Value}</th>
//     *     <td>{@code 0x0.fffffffffffffp-1022}</td>
//     * <tr><th scope="row">{@code Double.MIN_VALUE}</th>
//     *     <td>{@code 0x0.0000000000001p-1022}</td>
//     * </tbody>
//     * </table>
//     * @param   d   the {@code double} to be converted.
//     * @return a hex string representation of the argument.
//     * @since 1.5
//     * @author Joseph D. Darcy
//     */
//    public static String toHexString(double d) {
//        /*
//         * Modeled after the "a" conversion specifier in C99, section
//         * 7.19.6.1; however, the output of this method is more
//         * tightly specified.
//         */
//        if (!isFinite(d) )
//            // For infinity and NaN, use the decimal output.
//            return java.lang.Double.toString(d);
//        else {
//            // Initialized to maximum size of output.
//            StringBuilder answer = new StringBuilder(24);
//
//            if (Math.copySign(1.0, d) == -1.0)    // value is negative,
//                answer.append("-");                  // so append sign info
//
//            answer.append("0x");
//
//            d = Math.abs(d);
//
//            if(d == 0.0) {
//                answer.append("0.0p0");
//            } else {
//                boolean subnormal = (d < java.lang.Double.MIN_NORMAL);
//
//                // Isolate significand bits and OR in a high-order bit
//                // so that the string representation has a known
//                // length.
//                long signifBits = (java.lang.Double.doubleToLongBits(d)
//                        & DoubleConsts.SIGNIF_BIT_MASK) |
//                        0x1000000000000000L;
//
//                // Subnormal values have a 0 implicit bit; normal
//                // values have a 1 implicit bit.
//                answer.append(subnormal ? "0." : "1.");
//
//                // Isolate the low-order 13 digits of the hex
//                // representation.  If all the digits are zero,
//                // replace with a single 0; otherwise, remove all
//                // trailing zeros.
//                String signif = Long.toHexString(signifBits).substring(3,16);
//                answer.append(signif.equals("0000000000000") ? // 13 zeros
//                        "0":
//                        signif.replaceFirst("0{1,12}$", ""));
//
//                answer.append('p');
//                // If the value is subnormal, use the E_min exponent
//                // value for double; otherwise, extract and report d's
//                // exponent (the representation of a subnormal uses
//                // E_min -1).
//                answer.append(subnormal ?
//                        java.lang.Double.MIN_EXPONENT:
//                        Math.getExponent(d));
//            }
//            return answer.toString();
//        }
//    }
//
//    /**
//     * Returns a {@code Double} object holding the
//     * {@code double} value represented by the argument string
//     * {@code s}.
//     *
//     * <p>If {@code s} is {@code null}, then a
//     * {@code NullPointerException} is thrown.
//     *
//     * <p>Leading and trailing whitespace characters in {@code s}
//     * are ignored.  Whitespace is removed as if by the {@link
//     * String#trim} method; that is, both ASCII space and control
//     * characters are removed. The rest of {@code s} should
//     * constitute a <i>FloatValue</i> as described by the lexical
//     * syntax rules:
//     *
//     * <blockquote>
//     * <dl>
//     * <dt><i>FloatValue:</i>
//     * <dd><i>Sign<sub>opt</sub></i> {@code NaN}
//     * <dd><i>Sign<sub>opt</sub></i> {@code Infinity}
//     * <dd><i>Sign<sub>opt</sub> FloatingPointLiteral</i>
//     * <dd><i>Sign<sub>opt</sub> HexFloatingPointLiteral</i>
//     * <dd><i>SignedInteger</i>
//     * </dl>
//     *
//     * <dl>
//     * <dt><i>HexFloatingPointLiteral</i>:
//     * <dd> <i>HexSignificand BinaryExponent FloatTypeSuffix<sub>opt</sub></i>
//     * </dl>
//     *
//     * <dl>
//     * <dt><i>HexSignificand:</i>
//     * <dd><i>HexNumeral</i>
//     * <dd><i>HexNumeral</i> {@code .}
//     * <dd>{@code 0x} <i>HexDigits<sub>opt</sub>
//     *     </i>{@code .}<i> HexDigits</i>
//     * <dd>{@code 0X}<i> HexDigits<sub>opt</sub>
//     *     </i>{@code .} <i>HexDigits</i>
//     * </dl>
//     *
//     * <dl>
//     * <dt><i>BinaryExponent:</i>
//     * <dd><i>BinaryExponentIndicator SignedInteger</i>
//     * </dl>
//     *
//     * <dl>
//     * <dt><i>BinaryExponentIndicator:</i>
//     * <dd>{@code p}
//     * <dd>{@code P}
//     * </dl>
//     *
//     * </blockquote>
//     *
//     * where <i>Sign</i>, <i>FloatingPointLiteral</i>,
//     * <i>HexNumeral</i>, <i>HexDigits</i>, <i>SignedInteger</i> and
//     * <i>FloatTypeSuffix</i> are as defined in the lexical structure
//     * sections of
//     * <cite>The Java Language Specification</cite>,
//     * except that underscores are not accepted between digits.
//     * If {@code s} does not have the form of
//     * a <i>FloatValue</i>, then a {@code NumberFormatException}
//     * is thrown. Otherwise, {@code s} is regarded as
//     * representing an exact decimal value in the usual
//     * "computerized scientific notation" or as an exact
//     * hexadecimal value; this exact numerical value is then
//     * conceptually converted to an "infinitely precise"
//     * binary value that is then rounded to type {@code double}
//     * by the usual round-to-nearest rule of IEEE 754 floating-point
//     * arithmetic, which includes preserving the sign of a zero
//     * value.
//     *
//     * Note that the round-to-nearest rule also implies overflow and
//     * underflow behaviour; if the exact value of {@code s} is large
//     * enough in magnitude (greater than or equal to ({@link
//     * #MAX_VALUE} + {@link Math#ulp(double) ulp(MAX_VALUE)}/2),
//     * rounding to {@code double} will result in an infinity and if the
//     * exact value of {@code s} is small enough in magnitude (less
//     * than or equal to {@link #MIN_VALUE}/2), rounding to float will
//     * result in a zero.
//     *
//     * Finally, after rounding a {@code Double} object representing
//     * this {@code double} value is returned.
//     *
//     * <p> To interpret localized string representations of a
//     * floating-point value, use subclasses of {@link
//     * java.text.NumberFormat}.
//     *
//     * <p>Note that trailing format specifiers, specifiers that
//     * determine the type of a floating-point literal
//     * ({@code 1.0f} is a {@code float} value;
//     * {@code 1.0d} is a {@code double} value), do
//     * <em>not</em> influence the results of this method.  In other
//     * words, the numerical value of the input string is converted
//     * directly to the target floating-point type.  The two-step
//     * sequence of conversions, string to {@code float} followed
//     * by {@code float} to {@code double}, is <em>not</em>
//     * equivalent to converting a string directly to
//     * {@code double}. For example, the {@code float}
//     * literal {@code 0.1f} is equal to the {@code double}
//     * value {@code 0.10000000149011612}; the {@code float}
//     * literal {@code 0.1f} represents a different numerical
//     * value than the {@code double} literal
//     * {@code 0.1}. (The numerical value 0.1 cannot be exactly
//     * represented in a binary floating-point number.)
//     *
//     * <p>To avoid calling this method on an invalid string and having
//     * a {@code NumberFormatException} be thrown, the regular
//     * expression below can be used to screen the input string:
//     *
//     * <pre>{@code
//     *  final String Digits     = "(\\p{Digit}+)";
//     *  final String HexDigits  = "(\\p{XDigit}+)";
//     *  // an exponent is 'e' or 'E' followed by an optionally
//     *  // signed decimal integer.
//     *  final String Exp        = "[eE][+-]?"+Digits;
//     *  final String fpRegex    =
//     *      ("[\\x00-\\x20]*"+  // Optional leading "whitespace"
//     *       "[+-]?(" + // Optional sign character
//     *       "NaN|" +           // "NaN" string
//     *       "Infinity|" +      // "Infinity" string
//     *
//     *       // A decimal floating-point string representing a finite positive
//     *       // number without a leading sign has at most five basic pieces:
//     *       // Digits . Digits ExponentPart FloatTypeSuffix
//     *       //
//     *       // Since this method allows integer-only strings as input
//     *       // in addition to strings of floating-point literals, the
//     *       // two sub-patterns below are simplifications of the grammar
//     *       // productions from section 3.10.2 of
//     *       // The Java Language Specification.
//     *
//     *       // Digits ._opt Digits_opt ExponentPart_opt FloatTypeSuffix_opt
//     *       "((("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|"+
//     *
//     *       // . Digits ExponentPart_opt FloatTypeSuffix_opt
//     *       "(\\.("+Digits+")("+Exp+")?)|"+
//     *
//     *       // Hexadecimal strings
//     *       "((" +
//     *        // 0[xX] HexDigits ._opt BinaryExponent FloatTypeSuffix_opt
//     *        "(0[xX]" + HexDigits + "(\\.)?)|" +
//     *
//     *        // 0[xX] HexDigits_opt . HexDigits BinaryExponent FloatTypeSuffix_opt
//     *        "(0[xX]" + HexDigits + "?(\\.)" + HexDigits + ")" +
//     *
//     *        ")[pP][+-]?" + Digits + "))" +
//     *       "[fFdD]?))" +
//     *       "[\\x00-\\x20]*");// Optional trailing "whitespace"
//     *
//     *  if (Pattern.matches(fpRegex, myString))
//     *      Double.valueOf(myString); // Will not throw NumberFormatException
//     *  else {
//     *      // Perform suitable alternative action
//     *  }
//     * }</pre>
//     *
//     * @param      s   the string to be parsed.
//     * @return     a {@code Double} object holding the value
//     *             represented by the {@code String} argument.
//     * @throws     NumberFormatException  if the string does not contain a
//     *             parsable number.
//     */
//    public static java.lang.Double valueOf(String s) throws NumberFormatException {
//        return new java.lang.Double(parseDouble(s));
//    }
//
//    /**
//     * Returns a {@code Double} instance representing the specified
//     * {@code double} value.
//     * If a new {@code Double} instance is not required, this method
//     * should generally be used in preference to the constructor
//     * {@link #Double(double)}, as this method is likely to yield
//     * significantly better space and time performance by caching
//     * frequently requested values.
//     *
//     * @param  d a double value.
//     * @return a {@code Double} instance representing {@code d}.
//     * @since  1.5
//     */
//    @IntrinsicCandidate
//    public static java.lang.Double valueOf(double d) {
//        return new java.lang.Double(d);
//    }
//
//    /**
//     * Returns a new {@code double} initialized to the value
//     * represented by the specified {@code String}, as performed
//     * by the {@code valueOf} method of class
//     * {@code Double}.
//     *
//     * @param  s   the string to be parsed.
//     * @return the {@code double} value represented by the string
//     *         argument.
//     * @throws NullPointerException  if the string is null
//     * @throws NumberFormatException if the string does not contain
//     *         a parsable {@code double}.
//     * @see    java.lang.Double#valueOf(String)
//     * @since 1.2
//     */
//    public static double parseDouble(String s) throws NumberFormatException {
//        return FloatingDecimal.parseDouble(s);
//    }
//
//    /**
//     * Returns {@code true} if the specified number is a
//     * Not-a-Number (NaN) value, {@code false} otherwise.
//     *
//     * @param   v   the value to be tested.
//     * @return  {@code true} if the value of the argument is NaN;
//     *          {@code false} otherwise.
//     */
//    public static boolean isNaN(double v) {
//        return (v != v);
//    }
//
//    /**
//     * Returns {@code true} if the specified number is infinitely
//     * large in magnitude, {@code false} otherwise.
//     *
//     * @param   v   the value to be tested.
//     * @return  {@code true} if the value of the argument is positive
//     *          infinity or negative infinity; {@code false} otherwise.
//     */
//    public static boolean isInfinite(double v) {
//        return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
//    }
//
//    /**
//     * Returns {@code true} if the argument is a finite floating-point
//     * value; returns {@code false} otherwise (for NaN and infinity
//     * arguments).
//     *
//     * @param d the {@code double} value to be tested
//     * @return {@code true} if the argument is a finite
//     * floating-point value, {@code false} otherwise.
//     * @since 1.8
//     */
//    public static boolean isFinite(double d) {
//        return Math.abs(d) <= java.lang.Double.MAX_VALUE;
//    }
//
//    /**
//     * The value of the Double.
//     *
//     * @serial
//     */
//    private final double value;
//
//    /**
//     * Constructs a newly allocated {@code Double} object that
//     * represents the primitive {@code double} argument.
//     *
//     * @param   value   the value to be represented by the {@code Double}.
//     *
//     * @deprecated
//     * It is rarely appropriate to use this constructor. The static factory
//     * {@link #valueOf(double)} is generally a better choice, as it is
//     * likely to yield significantly better space and time performance.
//     */
//    @Deprecated(since="9", forRemoval = true)
//    public Double(double value) {
//        this.value = value;
//    }
//
//    /**
//     * Constructs a newly allocated {@code Double} object that
//     * represents the floating-point value of type {@code double}
//     * represented by the string. The string is converted to a
//     * {@code double} value as if by the {@code valueOf} method.
//     *
//     * @param  s  a string to be converted to a {@code Double}.
//     * @throws    NumberFormatException if the string does not contain a
//     *            parsable number.
//     *
//     * @deprecated
//     * It is rarely appropriate to use this constructor.
//     * Use {@link #parseDouble(String)} to convert a string to a
//     * {@code double} primitive, or use {@link #valueOf(String)}
//     * to convert a string to a {@code Double} object.
//     */
//    @Deprecated(since="9", forRemoval = true)
//    public Double(String s) throws NumberFormatException {
//        value = parseDouble(s);
//    }
//
//    /**
//     * Returns {@code true} if this {@code Double} value is
//     * a Not-a-Number (NaN), {@code false} otherwise.
//     *
//     * @return  {@code true} if the value represented by this object is
//     *          NaN; {@code false} otherwise.
//     */
//    public boolean isNaN() {
//        return isNaN(value);
//    }
//
//    /**
//     * Returns {@code true} if this {@code Double} value is
//     * infinitely large in magnitude, {@code false} otherwise.
//     *
//     * @return  {@code true} if the value represented by this object is
//     *          positive infinity or negative infinity;
//     *          {@code false} otherwise.
//     */
//    public boolean isInfinite() {
//        return isInfinite(value);
//    }
//
//    /**
//     * Returns a string representation of this {@code Double} object.
//     * The primitive {@code double} value represented by this
//     * object is converted to a string exactly as if by the method
//     * {@code toString} of one argument.
//     *
//     * @return  a {@code String} representation of this object.
//     * @see java.lang.Double#toString(double)
//     */
//    public String toString() {
//        return toString(value);
//    }
//
//    /**
//     * Returns the value of this {@code Double} as a {@code byte}
//     * after a narrowing primitive conversion.
//     *
//     * @return  the {@code double} value represented by this object
//     *          converted to type {@code byte}
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     * @since 1.1
//     */
//    public byte byteValue() {
//        return (byte)value;
//    }
//
//    /**
//     * Returns the value of this {@code Double} as a {@code short}
//     * after a narrowing primitive conversion.
//     *
//     * @return  the {@code double} value represented by this object
//     *          converted to type {@code short}
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     * @since 1.1
//     */
//    public short shortValue() {
//        return (short)value;
//    }
//
//    /**
//     * Returns the value of this {@code Double} as an {@code int}
//     * after a narrowing primitive conversion.
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     *
//     * @return  the {@code double} value represented by this object
//     *          converted to type {@code int}
//     */
//    public int intValue() {
//        return (int)value;
//    }
//
//    /**
//     * Returns the value of this {@code Double} as a {@code long}
//     * after a narrowing primitive conversion.
//     *
//     * @return  the {@code double} value represented by this object
//     *          converted to type {@code long}
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     */
//    public long longValue() {
//        return (long)value;
//    }
//
//    /**
//     * Returns the value of this {@code Double} as a {@code float}
//     * after a narrowing primitive conversion.
//     *
//     * @return  the {@code double} value represented by this object
//     *          converted to type {@code float}
//     * @jls 5.1.3 Narrowing Primitive Conversion
//     * @since 1.0
//     */
//    public float floatValue() {
//        return (float)value;
//    }
//
//    /**
//     * Returns the {@code double} value of this {@code Double} object.
//     *
//     * @return the {@code double} value represented by this object
//     */
//    @IntrinsicCandidate
//    public double doubleValue() {
//        return value;
//    }
//
//    /**
//     * Returns a hash code for this {@code Double} object. The
//     * result is the exclusive OR of the two halves of the
//     * {@code long} integer bit representation, exactly as
//     * produced by the method {@link #doubleToLongBits(double)}, of
//     * the primitive {@code double} value represented by this
//     * {@code Double} object. That is, the hash code is the value
//     * of the expression:
//     *
//     * <blockquote>
//     *  {@code (int)(v^(v>>>32))}
//     * </blockquote>
//     *
//     * where {@code v} is defined by:
//     *
//     * <blockquote>
//     *  {@code long v = Double.doubleToLongBits(this.doubleValue());}
//     * </blockquote>
//     *
//     * @return  a {@code hash code} value for this object.
//     */
//    @Override
//    public int hashCode() {
//        return java.lang.Double.hashCode(value);
//    }
//
//    /**
//     * Returns a hash code for a {@code double} value; compatible with
//     * {@code Double.hashCode()}.
//     *
//     * @param value the value to hash
//     * @return a hash code value for a {@code double} value.
//     * @since 1.8
//     */
//    public static int hashCode(double value) {
//        long bits = doubleToLongBits(value);
//        return (int)(bits ^ (bits >>> 32));
//    }
//
//    /**
//     * Compares this object against the specified object.  The result
//     * is {@code true} if and only if the argument is not
//     * {@code null} and is a {@code Double} object that
//     * represents a {@code double} that has the same value as the
//     * {@code double} represented by this object. For this
//     * purpose, two {@code double} values are considered to be
//     * the same if and only if the method {@link
//     * #doubleToLongBits(double)} returns the identical
//     * {@code long} value when applied to each.
//     *
//     * <p>Note that in most cases, for two instances of class
//     * {@code Double}, {@code d1} and {@code d2}, the
//     * value of {@code d1.equals(d2)} is {@code true} if and
//     * only if
//     *
//     * <blockquote>
//     *  {@code d1.doubleValue() == d2.doubleValue()}
//     * </blockquote>
//     *
//     * <p>also has the value {@code true}. However, there are two
//     * exceptions:
//     * <ul>
//     * <li>If {@code d1} and {@code d2} both represent
//     *     {@code Double.NaN}, then the {@code equals} method
//     *     returns {@code true}, even though
//     *     {@code Double.NaN==Double.NaN} has the value
//     *     {@code false}.
//     * <li>If {@code d1} represents {@code +0.0} while
//     *     {@code d2} represents {@code -0.0}, or vice versa,
//     *     the {@code equal} test has the value {@code false},
//     *     even though {@code +0.0==-0.0} has the value {@code true}.
//     * </ul>
//     * This definition allows hash tables to operate properly.
//     * @param   obj   the object to compare with.
//     * @return  {@code true} if the objects are the same;
//     *          {@code false} otherwise.
//     * @see java.lang.Double#doubleToLongBits(double)
//     */
//    public boolean equals(Object obj) {
//        return (obj instanceof java.lang.Double)
//                && (doubleToLongBits(((java.lang.Double)obj).value) ==
//                doubleToLongBits(value));
//    }
//
//    /**
//     * Returns a representation of the specified floating-point value
//     * according to the IEEE 754 floating-point "double
//     * format" bit layout.
//     *
//     * <p>Bit 63 (the bit that is selected by the mask
//     * {@code 0x8000000000000000L}) represents the sign of the
//     * floating-point number. Bits
//     * 62-52 (the bits that are selected by the mask
//     * {@code 0x7ff0000000000000L}) represent the exponent. Bits 51-0
//     * (the bits that are selected by the mask
//     * {@code 0x000fffffffffffffL}) represent the significand
//     * (sometimes called the mantissa) of the floating-point number.
//     *
//     * <p>If the argument is positive infinity, the result is
//     * {@code 0x7ff0000000000000L}.
//     *
//     * <p>If the argument is negative infinity, the result is
//     * {@code 0xfff0000000000000L}.
//     *
//     * <p>If the argument is NaN, the result is
//     * {@code 0x7ff8000000000000L}.
//     *
//     * <p>In all cases, the result is a {@code long} integer that, when
//     * given to the {@link #longBitsToDouble(long)} method, will produce a
//     * floating-point value the same as the argument to
//     * {@code doubleToLongBits} (except all NaN values are
//     * collapsed to a single "canonical" NaN value).
//     *
//     * @param   value   a {@code double} precision floating-point number.
//     * @return the bits that represent the floating-point number.
//     */
//    @IntrinsicCandidate
//    public static long doubleToLongBits(double value) {
//        if (!isNaN(value)) {
//            return doubleToRawLongBits(value);
//        }
//        return 0x7ff8000000000000L;
//    }
//
//    /**
//     * Returns a representation of the specified floating-point value
//     * according to the IEEE 754 floating-point "double
//     * format" bit layout, preserving Not-a-Number (NaN) values.
//     *
//     * <p>Bit 63 (the bit that is selected by the mask
//     * {@code 0x8000000000000000L}) represents the sign of the
//     * floating-point number. Bits
//     * 62-52 (the bits that are selected by the mask
//     * {@code 0x7ff0000000000000L}) represent the exponent. Bits 51-0
//     * (the bits that are selected by the mask
//     * {@code 0x000fffffffffffffL}) represent the significand
//     * (sometimes called the mantissa) of the floating-point number.
//     *
//     * <p>If the argument is positive infinity, the result is
//     * {@code 0x7ff0000000000000L}.
//     *
//     * <p>If the argument is negative infinity, the result is
//     * {@code 0xfff0000000000000L}.
//     *
//     * <p>If the argument is NaN, the result is the {@code long}
//     * integer representing the actual NaN value.  Unlike the
//     * {@code doubleToLongBits} method,
//     * {@code doubleToRawLongBits} does not collapse all the bit
//     * patterns encoding a NaN to a single "canonical" NaN
//     * value.
//     *
//     * <p>In all cases, the result is a {@code long} integer that,
//     * when given to the {@link #longBitsToDouble(long)} method, will
//     * produce a floating-point value the same as the argument to
//     * {@code doubleToRawLongBits}.
//     *
//     * @param   value   a {@code double} precision floating-point number.
//     * @return the bits that represent the floating-point number.
//     * @since 1.3
//     */
//    @IntrinsicCandidate
//    public static native long doubleToRawLongBits(double value);
//
//    /**
//     * Returns the {@code double} value corresponding to a given
//     * bit representation.
//     * The argument is considered to be a representation of a
//     * floating-point value according to the IEEE 754 floating-point
//     * "double format" bit layout.
//     *
//     * <p>If the argument is {@code 0x7ff0000000000000L}, the result
//     * is positive infinity.
//     *
//     * <p>If the argument is {@code 0xfff0000000000000L}, the result
//     * is negative infinity.
//     *
//     * <p>If the argument is any value in the range
//     * {@code 0x7ff0000000000001L} through
//     * {@code 0x7fffffffffffffffL} or in the range
//     * {@code 0xfff0000000000001L} through
//     * {@code 0xffffffffffffffffL}, the result is a NaN.  No IEEE
//     * 754 floating-point operation provided by Java can distinguish
//     * between two NaN values of the same type with different bit
//     * patterns.  Distinct values of NaN are only distinguishable by
//     * use of the {@code Double.doubleToRawLongBits} method.
//     *
//     * <p>In all other cases, let <i>s</i>, <i>e</i>, and <i>m</i> be three
//     * values that can be computed from the argument:
//     *
//     * <blockquote><pre>{@code
//     * int s = ((bits >> 63) == 0) ? 1 : -1;
//     * int e = (int)((bits >> 52) & 0x7ffL);
//     * long m = (e == 0) ?
//     *                 (bits & 0xfffffffffffffL) << 1 :
//     *                 (bits & 0xfffffffffffffL) | 0x10000000000000L;
//     * }</pre></blockquote>
//     *
//     * Then the floating-point result equals the value of the mathematical
//     * expression <i>s</i>&middot;<i>m</i>&middot;2<sup><i>e</i>-1075</sup>.
//     *
//     * <p>Note that this method may not be able to return a
//     * {@code double} NaN with exactly same bit pattern as the
//     * {@code long} argument.  IEEE 754 distinguishes between two
//     * kinds of NaNs, quiet NaNs and <i>signaling NaNs</i>.  The
//     * differences between the two kinds of NaN are generally not
//     * visible in Java.  Arithmetic operations on signaling NaNs turn
//     * them into quiet NaNs with a different, but often similar, bit
//     * pattern.  However, on some processors merely copying a
//     * signaling NaN also performs that conversion.  In particular,
//     * copying a signaling NaN to return it to the calling method
//     * may perform this conversion.  So {@code longBitsToDouble}
//     * may not be able to return a {@code double} with a
//     * signaling NaN bit pattern.  Consequently, for some
//     * {@code long} values,
//     * {@code doubleToRawLongBits(longBitsToDouble(start))} may
//     * <i>not</i> equal {@code start}.  Moreover, which
//     * particular bit patterns represent signaling NaNs is platform
//     * dependent; although all NaN bit patterns, quiet or signaling,
//     * must be in the NaN range identified above.
//     *
//     * @param   bits   any {@code long} integer.
//     * @return  the {@code double} floating-point value with the same
//     *          bit pattern.
//     */
//    @IntrinsicCandidate
//    public static native double longBitsToDouble(long bits);
//
//    /**
//     * Compares two {@code Double} objects numerically.  There
//     * are two ways in which comparisons performed by this method
//     * differ from those performed by the Java language numerical
//     * comparison operators ({@code <, <=, ==, >=, >})
//     * when applied to primitive {@code double} values:
//     * <ul><li>
//     *          {@code Double.NaN} is considered by this method
//     *          to be equal to itself and greater than all other
//     *          {@code double} values (including
//     *          {@code Double.POSITIVE_INFINITY}).
//     * <li>
//     *          {@code 0.0d} is considered by this method to be greater
//     *          than {@code -0.0d}.
//     * </ul>
//     * This ensures that the <i>natural ordering</i> of
//     * {@code Double} objects imposed by this method is <i>consistent
//     * with equals</i>.
//     *
//     * @param   anotherDouble   the {@code Double} to be compared.
//     * @return  the value {@code 0} if {@code anotherDouble} is
//     *          numerically equal to this {@code Double}; a value
//     *          less than {@code 0} if this {@code Double}
//     *          is numerically less than {@code anotherDouble};
//     *          and a value greater than {@code 0} if this
//     *          {@code Double} is numerically greater than
//     *          {@code anotherDouble}.
//     *
//     * @since   1.2
//     */
//    public int compareTo(java.lang.Double anotherDouble) {
//        return java.lang.Double.compare(value, anotherDouble.value);
//    }
//
//    /**
//     * Compares the two specified {@code double} values. The sign
//     * of the integer value returned is the same as that of the
//     * integer that would be returned by the call:
//     * <pre>
//     *    new Double(d1).compareTo(new Double(d2))
//     * </pre>
//     *
//     * @param   d1        the first {@code double} to compare
//     * @param   d2        the second {@code double} to compare
//     * @return  the value {@code 0} if {@code d1} is
//     *          numerically equal to {@code d2}; a value less than
//     *          {@code 0} if {@code d1} is numerically less than
//     *          {@code d2}; and a value greater than {@code 0}
//     *          if {@code d1} is numerically greater than
//     *          {@code d2}.
//     * @since 1.4
//     */
//    public static int compare(double d1, double d2) {
//        if (d1 < d2)
//            return -1;           // Neither val is NaN, thisVal is smaller
//        if (d1 > d2)
//            return 1;            // Neither val is NaN, thisVal is larger
//
//        // Cannot use doubleToRawLongBits because of possibility of NaNs.
//        long thisBits    = java.lang.Double.doubleToLongBits(d1);
//        long anotherBits = java.lang.Double.doubleToLongBits(d2);
//
//        return (thisBits == anotherBits ?  0 : // Values are equal
//                (thisBits < anotherBits ? -1 : // (-0.0, 0.0) or (!NaN, NaN)
//                        1));                          // (0.0, -0.0) or (NaN, !NaN)
//    }
//
//    /**
//     * Adds two {@code double} values together as per the + operator.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the sum of {@code a} and {@code b}
//     * @jls 4.2.4 Floating-Point Operations
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static double sum(double a, double b) {
//        return a + b;
//    }
//
//    /**
//     * Returns the greater of two {@code double} values
//     * as if by calling {@link Math#max(double, double) Math.max}.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the greater of {@code a} and {@code b}
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static double max(double a, double b) {
//        return Math.max(a, b);
//    }
//
//    /**
//     * Returns the smaller of two {@code double} values
//     * as if by calling {@link Math#min(double, double) Math.min}.
//     *
//     * @param a the first operand
//     * @param b the second operand
//     * @return the smaller of {@code a} and {@code b}.
//     * @see java.util.function.BinaryOperator
//     * @since 1.8
//     */
//    public static double min(double a, double b) {
//        return Math.min(a, b);
//    }
//
//    /**
//     * Returns an {@link Optional} containing the nominal descriptor for this
//     * instance, which is the instance itself.
//     *
//     * @return an {@link Optional} describing the {@linkplain java.lang.Double} instance
//     * @since 12
//     */
//    @Override
//    public Optional<java.lang.Double> describeConstable() {
//        return Optional.of(this);
//    }
//
//    /**
//     * Resolves this instance as a {@link ConstantDesc}, the result of which is
//     * the instance itself.
//     *
//     * @param lookup ignored
//     * @return the {@linkplain java.lang.Double} instance
//     * @since 12
//     */
//    @Override
//    public java.lang.Double resolveConstantDesc(MethodHandles.Lookup lookup) {
//        return this;
//    }
//
//    /** use serialVersionUID from JDK 1.0.2 for interoperability */
//    @java.io.Serial
//    private static final long serialVersionUID = -9172774392245257468L;
//}
