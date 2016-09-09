SECTION = "devel/chicken"
DESCRIPTION = "Thread-safe queues with timeout"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://mailbox.meta;md5=1155f4d267b58a976d0f1a37d52ab7bf"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-record-variants-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-condition-utils nativesdk-chicken-egg-record-variants chicken-egg-setup-helper-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-condition-utils-crosssdk chicken-egg-record-variants-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-record-variants chicken-egg-setup-helper-cross chicken-egg-check-errors-cross chicken-egg-condition-utils-cross chicken-egg-record-variants-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-check-errors chicken-egg-condition-utils chicken-egg-record-variants"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mailbox/mailbox-${PV}.tar.gz"

SRC_URI[md5sum] = "bee1a534d1dab184efc45e9d0ea7a875"
SRC_URI[sha256sum] = "9cb3e12032837340c1113e2799c72f26b8599c1063a2d209884a3c7de7b2f2f2"

S = "${WORKDIR}/mailbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
