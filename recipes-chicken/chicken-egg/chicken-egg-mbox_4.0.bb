SECTION = "devel/chicken"
DESCRIPTION = "Routines for parsing Unix mbox files."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://mbox.meta;md5=3cb31fc979f917d88f8b11e71a5ba552"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-abnf-cross chicken-egg-internet-message-cross chicken-egg-internet-timestamp-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-abnf-crosssdk chicken-egg-internet-message-crosssdk chicken-egg-internet-timestamp-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-input-classes nativesdk-chicken-egg-abnf nativesdk-chicken-egg-internet-message nativesdk-chicken-egg-internet-timestamp chicken-egg-typeclass-crosssdk chicken-egg-input-classes-crosssdk chicken-egg-abnf-crosssdk chicken-egg-internet-message-crosssdk chicken-egg-internet-timestamp-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-abnf chicken-egg-internet-message chicken-egg-internet-timestamp chicken-egg-typeclass-cross chicken-egg-input-classes-cross chicken-egg-abnf-cross chicken-egg-internet-message-cross chicken-egg-internet-timestamp-cross chicken-egg-mbox-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-input-classes chicken-egg-abnf chicken-egg-internet-message chicken-egg-internet-timestamp"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/mbox/mbox-${PV}.tar.gz"

SRC_URI[md5sum] = "85260aba5f881e8603053f1b5497ad97"
SRC_URI[sha256sum] = "a2134d99798c7ab89c612b0ce4cdd7a18963aa64fdfca44f9674c388bd1254dd"

S = "${WORKDIR}/mbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
