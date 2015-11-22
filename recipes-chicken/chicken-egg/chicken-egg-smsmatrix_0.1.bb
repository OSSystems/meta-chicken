SECTION = "devel/chicken"
DESCRIPTION = "Library for using the SMSMatrix gateway services for sending SMS and fax messages"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://smsmatrix.meta;md5=32ba79718d5c78ec97152720da752974"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client chicken-egg-http-client-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-http-client-cross"
RDEPENDS_${PN} = " chicken-egg-http-client"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/smsmatrix/smsmatrix-${PV}.tar.gz"

SRC_URI[md5sum] = "54cbea72ccbbfb4d5fdfe03a96d7915c"
SRC_URI[sha256sum] = "dd2d37c306e5249174dbff7c32c31525fe2b32d5772f4fe7669202f738bcf37c"

S = "${WORKDIR}/smsmatrix-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
