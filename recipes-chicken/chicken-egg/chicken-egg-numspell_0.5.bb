SECTION = "devel/chicken"
DESCRIPTION = "Spelling Numbers as English in Scheme"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://numspell.meta;md5=4f4a0838e6d2c19f7cb8e0ef06f4546a"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers chicken-egg-numbers-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-numbers-cross"
RDEPENDS_${PN} = " chicken-egg-numbers"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/numspell/numspell-${PV}.tar.gz"

SRC_URI[md5sum] = "56d102ca843be422a7eb79fc58acbf99"
SRC_URI[sha256sum] = "6fa4e4475880ada7329de0ea41fb593899fe67f2467d66b0a5471b20ecfdb6f4"

S = "${WORKDIR}/numspell-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
