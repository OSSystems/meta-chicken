inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Encoding and decoding of base64 strings"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://base64.meta;md5=ec0b0735d03bfcf8be9885680e4f000f"
