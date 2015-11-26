SECTION = "devel/chicken"
DESCRIPTION = "Thread-safe queues with timeout"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mailbox.meta;md5=bffd5d1da9f09c732f3ad3b03da156a7"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-record-variants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-record-variants chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-record-variants chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-record-variants-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mailbox/mailbox-${PV}.tar.gz"

SRC_URI[md5sum] = "e91f87a4d0216157fb8cfeea509c7bc2"
SRC_URI[sha256sum] = "700d5e12a1bac6f440d43496a947226d1187ab4d3f4c056649c3b13810958584"

S = "${WORKDIR}/mailbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
