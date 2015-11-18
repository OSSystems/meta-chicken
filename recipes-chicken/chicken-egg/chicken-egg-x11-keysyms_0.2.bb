SECTION = "devel/chicken"
DESCRIPTION = "Encoding and decoding of the most common X11 Keysym-names"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://x11-keysyms.meta;md5=1cc81ec1352f55a25ffefc848ae53636"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/x11-keysyms/x11-keysyms-${PV}.tar.gz"

SRC_URI[md5sum] = "6ff3cc0a7f427ad95e33a6d024ea8476"
SRC_URI[sha256sum] = "411842f49ab4656e6d6a42f8fb5eaec09029b43aaf7efbac36c8842def9f3ff0"

S = "${WORKDIR}/x11-keysyms-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
