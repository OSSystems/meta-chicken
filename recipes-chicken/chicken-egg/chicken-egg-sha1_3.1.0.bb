SECTION = "devel/chicken"
DESCRIPTION = "Computes SHA1 (FIPS-180-1) checksums"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sha1.meta;md5=64be8bb02cbf4d530fb299f2c4632cfa"
DEPENDS_append_class-cross = " chicken-egg-message-digest-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-message-digest-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-message-digest chicken-egg-message-digest-crosssdk"
DEPENDS = " chicken-egg-message-digest chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-message-digest"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sha1/sha1-${PV}.tar.gz"

SRC_URI[md5sum] = "6ad974b855183a9126039037ff8fc48e"
SRC_URI[sha256sum] = "8b68c48043c72a6832966cbae13ef792d9e9be4751a8f4a6fc3450e4ecc242ec"

S = "${WORKDIR}/sha1-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
