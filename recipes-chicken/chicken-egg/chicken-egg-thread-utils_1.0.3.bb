SECTION = "devel/chicken"
DESCRIPTION = "Thread Utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://thread-utils.meta;md5=a2f724b364e790ada3ffec42fbee3701"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross chicken-egg-miscmacros-cross chicken-egg-synch-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-synch-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-record-variants nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-synch chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-record-variants-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-synch-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-record-variants chicken-egg-miscmacros chicken-egg-synch chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-record-variants-cross chicken-egg-miscmacros-cross chicken-egg-synch-cross chicken-egg-thread-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-record-variants chicken-egg-miscmacros chicken-egg-synch"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/thread-utils/thread-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "03a05dd187dd292480bd1f2b3874fac5"
SRC_URI[sha256sum] = "5ef2ea18e1fe18e78978674a88fdd4f81a61309da97354d93981ca2f60718eaf"

S = "${WORKDIR}/thread-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
