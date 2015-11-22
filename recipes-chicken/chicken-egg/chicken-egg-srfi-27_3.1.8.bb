SECTION = "devel/chicken"
DESCRIPTION = "Sources of Random Bits"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-27.meta;md5=9692d3f0fdbe1851292211c0a71b6f04"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-timed-resource-cross chicken-egg-thread-utils-cross chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross chicken-egg-numbers-cross chicken-egg-synch-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-timed-resource-crosssdk chicken-egg-thread-utils-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-numbers-crosssdk chicken-egg-synch-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-timed-resource nativesdk-chicken-egg-thread-utils nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-vector-lib nativesdk-chicken-egg-numbers nativesdk-chicken-egg-synch chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-timed-resource-crosssdk chicken-egg-thread-utils-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-vector-lib-crosssdk chicken-egg-numbers-crosssdk chicken-egg-synch-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-timed-resource chicken-egg-thread-utils chicken-egg-miscmacros chicken-egg-vector-lib chicken-egg-numbers chicken-egg-synch chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-timed-resource-cross chicken-egg-thread-utils-cross chicken-egg-miscmacros-cross chicken-egg-vector-lib-cross chicken-egg-numbers-cross chicken-egg-synch-cross chicken-egg-srfi-27-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-timed-resource chicken-egg-thread-utils chicken-egg-miscmacros chicken-egg-vector-lib chicken-egg-numbers chicken-egg-synch"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-27/srfi-27-${PV}.tar.gz"

SRC_URI[md5sum] = "5aa89b835027c08aa9b6eafeea8d57cf"
SRC_URI[sha256sum] = "72ab1527446df0c78dd64595e4274c1b29ca90647d3778ee4bd52dcdb561eedf"

S = "${WORKDIR}/srfi-27-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
